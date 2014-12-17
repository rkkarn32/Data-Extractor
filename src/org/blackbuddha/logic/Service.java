/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackbuddha.logic;

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
