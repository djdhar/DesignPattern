package org.example.behavioral.chainofresponsibility.classes;

public class DebugLogger extends Logger {
    public DebugLogger() {
        super(Logger.DEBUG);
    }

    @Override
    protected void write(String message) {
        System.out.println("Logging DEBUG : " + message);
    }
}
