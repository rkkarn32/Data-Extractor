package org.blackbudha.validator;

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
}
