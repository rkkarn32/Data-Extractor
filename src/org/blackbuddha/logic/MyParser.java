/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackbuddha.logic;

/**
 *
 * @author ramesh
 */
public class MyParser {
     public static String emailParser(String inputString){
        Validator validator = new Validator();
        StringBuilder outputString = new StringBuilder();
        inputString = inputString.trim();
        boolean first =true;
        String []emails = inputString.split("[\\n\\r\\s]+");
        for(String s:emails){
            if(validator.emailValidate(s)){
                if(!first)
                    outputString.append(",");
                else
                    first =false;
                outputString.append(s);
            }
        }
        return outputString.toString();
            
    }
     public static String emailParser(String inputString,long number){
        Validator validator = new Validator();
        StringBuilder outputString = new StringBuilder();
        inputString = inputString.trim();
        boolean first =true;
        String []emails = inputString.split("[\\n\\r\\s]+");
        long count =0;
        for(String s:emails){
            if(validator.emailValidate(s)){
                if(!first)
                    outputString.append(",");
                else
                    first =false;
                outputString.append(s);
                count++;
                if(count>=number)
                    break;
            }
        }
        return outputString.toString();
            
    }
    
    public static String phoneParser(String inputString){
         Validator validator = new Validator();
        StringBuilder outputString = new StringBuilder();
        inputString = inputString.trim();
        String []phones = inputString.split("[\\n\\r\\s]+");
        boolean first =true;
        for(String s:phones){
                String formatted = validator.formatPhoneString(s);
                if(formatted!=null){
                    if(!first)
                        outputString.append(",");
                    else
                        first =false;
                    outputString.append(formatted);
                }
        }
        return outputString.toString();
    }
    
    public static String phoneParser(String inputString,long number){
         Validator validator = new Validator();
        StringBuilder outputString = new StringBuilder();
        inputString = inputString.trim();
        String []phones = inputString.split("[\\n\\r\\s]+");
        boolean first =true;
        long count=0;
        for(String s:phones){
                String formatted = validator.formatPhoneString(s);
                if(formatted!=null){
                    if(!first)
                        outputString.append(",");
                    else
                        first =false;
                    outputString.append(formatted);
                    count++;
                    if(count>=number)
                        break;
                }
        }
        return outputString.toString();
    }
}
