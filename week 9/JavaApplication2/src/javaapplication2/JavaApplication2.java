/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JavaApplication2 {
    // Create a Logger instance
    private static final Logger logger = LogManager.getLogger(JavaApplication2.class);

    public static void main(String[] args) {
        logger.trace("This is a TRACE level message");
        logger.debug("This is a DEBUG level message");
        logger.info("This is an INFO level message");
        logger.warn("This is a WARN level message");
        logger.error("This is an ERROR level message");
        logger.fatal("This is a FATAL level message");
    }
}
