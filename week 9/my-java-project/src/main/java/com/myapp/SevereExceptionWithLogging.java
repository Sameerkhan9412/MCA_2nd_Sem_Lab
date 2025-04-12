package com.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SevereExceptionWithLogging {

    private static final Logger logger = LoggerFactory.getLogger(SevereExceptionWithLogging.class);

    public static void main(String[] args) {
        try {
            String str = null;
            int length = getLengthOfString(str); 
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
          
            logger.error("A severe error occurred: Attempted to access a method on a null object.", e);
            System.exit(1);
        }
    }

    public static int getLengthOfString(String str) {
        return str.length(); 
    }
}
