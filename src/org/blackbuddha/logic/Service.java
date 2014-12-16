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
import org.blackbudha.gui.FileUploader;

/**
 *
 * @author prmaod
 */
public class Service {

    public static String processFile(String src, FileTypes type) {
        String extracted = extractData(src);
        String result;
        switch (type) {
            case email:
                result = MyParser.emailParser(extracted);
                break;
            case phone:
                result = MyParser.phoneParser(extracted);
                break;
            default:
                throw new AssertionError(type.name());
        }
        return result;
    }
    
   
    
    public static String extractData(String filePath) {
        return FileProcessor.extractData(filePath);
    }
    public static void saveData(String inputString, String location) {
        FileProcessor.saveFile(inputString, location);
    }


}
