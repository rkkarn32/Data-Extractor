package org.blackbuddha.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ramesh
 */
public class Validator {

    private Pattern emailPattern;
    private Pattern phonePattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public Validator() {
        emailPattern = Pattern.compile(EMAIL_PATTERN);
        
    }

    public boolean emailValidate(final String hex) {

        matcher = emailPattern.matcher(hex);
        return matcher.matches();

    }
    public boolean phonevalidator(final String hex){
        
        return true;
    }
    public String formatPhoneString(String phone){
        int l = phone.length();
        if(l<10)
            return null;
        else{
            int i = l-10;
            String subString = phone.substring(i, l);
            try {
                long num = Long.parseLong(subString);
            } catch (NumberFormatException e) {
                
            }
            return subString;
        }
    }
}
