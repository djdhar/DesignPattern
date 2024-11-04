package org.example.structural.facade;

public class Driver {
    public static void main(String[] args) {
        MovieRecordingFacade movieRecordingFacade = new MovieRecordingFacade();
        movieRecordingFacade.initiate();
        movieRecordingFacade.terminate();
    }
}
