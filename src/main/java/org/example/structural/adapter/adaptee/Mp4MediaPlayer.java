package org.example.structural.adapter.adaptee;

public class Mp4MediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp3(String filePath) {

    }

    @Override
    public void playMp4(String filePath) {
        System.out.println("Advanced Playing MP4 :: " + filePath);
    }
}
