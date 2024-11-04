package org.example.structural.adapter.adaptee;

public class Mp3MediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp3(String filePath) {
        System.out.println("Advanced Playing MP3 :: " + filePath);
    }

    @Override
    public void playMp4(String filePath) {

    }
}
