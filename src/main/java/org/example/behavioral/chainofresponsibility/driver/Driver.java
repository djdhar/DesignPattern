package org.example.behavioral.chainofresponsibility.driver;

import org.example.behavioral.chainofresponsibility.classes.DebugLogger;
import org.example.behavioral.chainofresponsibility.classes.ErrorLogger;
import org.example.behavioral.chainofresponsibility.classes.InfoLogger;
import org.example.behavioral.chainofresponsibility.classes.Logger;

public class Driver {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        infoLogger.logMessage(Logger.INFO, "Dibya info;");
        infoLogger.logMessage(Logger.DEBUG, "Dibya debug;");
        infoLogger.logMessage(Logger.ERROR, "Dibya error;");
    }
}
