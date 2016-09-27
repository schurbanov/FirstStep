package ru.schurbanov;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by schurbanov on 9/27/2016.
 */
public class MyLogger {
    public Logger logger = Logger.getLogger(this.getClass().getName());
    public FileHandler filehandler;

    public void MyLoggerSetup(String logFName) {
        try {
            filehandler = new FileHandler(logFName);
            logger.addHandler(filehandler);
            logger.log(Level.INFO, "Log file has been created.");
        } catch (SecurityException e) {
            logger.log(Level.WARNING,
            "Couldn't create the log file due to security exception.", e);
        } catch (IOException e) {
            logger.log(Level.WARNING,
            "Couldn't create the log file due to I/O exception.", e);
        }
    }

    public void Log(Level level, String msg) {
        logger.log(level, msg);
    }

}

