package org.example.behavioral.chainofresponsibility.classes;

public abstract class  Logger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private int level;
    private Logger nextLogger;

    public Logger(int level) {
        this.level = level;
    }

    public void setNextLogger(Logger logger) {
        this.nextLogger = logger;
    }

    public void logMessage(int level, String message) {
        if(this.level == level) {
            this.write(message);
        } else {
            nextLogger.logMessage(level, message);
        }
    }

     protected abstract void write(String message);
}
