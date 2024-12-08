package org.example.behavioral.chainofresponsibility.classes;

public class ErrorLogger extends Logger {
    public ErrorLogger() {
        super(Logger.ERROR);
    }

    @Override
    protected void write(String message) {
        System.out.println("Logging ERROR : " + message);
    }
}
