/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackbudh.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.blackbudha.files.FileUploader;

/**
 *
 * @author ramesh
 */
public class FileParser {
    public static File emailParser(String filePath){
          FileInputStream in = null ;
          FileOutputStream out=null ;
            
        try {
             in = new FileInputStream(filePath);
             out = new FileOutputStream("email");
             
             BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));
             StringBuilder sb = new StringBuilder();
             String text = reader.readLine();
             while(text !=null ){
                 sb.append(text);
                 sb.append(System.lineSeparator());
                 text=reader.readLine();
             }
             String fileContent = sb.toString();
             String []list = fileContent.split(" ");
             
             System.out.println(sb);
//            byte[] buff = new byte[1024];
//            int byteRead;
//            while((byteRead=in.read(buff))>0){
//                out.write(buff,0,byteRead);
//            }
            in.close();
//            out.close();
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(FileUploader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileUploader.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
        
        
        return null;
    }
    
    public static File phoneParser(String filePath){
        return null;
    }
    
}
