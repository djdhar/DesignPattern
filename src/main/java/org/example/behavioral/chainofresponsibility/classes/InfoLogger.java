package org.example.behavioral.chainofresponsibility.classes;

public class InfoLogger extends Logger {
    public InfoLogger() {
        super(Logger.INFO);
    }

    @Override
    protected void write(String message) {
        System.out.println("Logging INFO : " + message);
    }
}
