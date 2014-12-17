/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackbuddha.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.blackbudha.gui.ExtractorApplication;

/**
 *
 * @author prmaod
 */
public class FileProcessor {

    public static String extractData(String filePath) {
        FileInputStream in = null;
        StringBuilder sb = new StringBuilder();
        try {
            in = new FileInputStream(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));
            String text = reader.readLine();
            while (text != null) {
                sb.append(text);
                sb.append(System.lineSeparator());
                text = reader.readLine();
            }
            
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExtractorApplication.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExtractorApplication.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        return sb.toString();
    }
    
    public static void saveFile(String inputString, String location) {
        FileOutputStream fop = null;
        File file;

        try {

            file = new File(location);
            fop = new FileOutputStream(file);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // get the content in bytes
            byte[] contentInBytes = inputString.getBytes();

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}

