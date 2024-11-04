package org.example.structural.adapter.adapter;

import org.example.structural.adapter.adaptee.AdvancedMediaPlayer;
import org.example.structural.adapter.adaptee.Mp3MediaPlayer;
import org.example.structural.adapter.adaptee.Mp4MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String fileType) {
        if("MP4".equals(fileType)) {
            advancedMediaPlayer = new Mp4MediaPlayer();
        } else if("MP3".equals(fileType)) {
            advancedMediaPlayer = new Mp3MediaPlayer();
        }
    }
    @Override
    public void play(String fileType, String filePath) {
        if("MP4".equals(fileType)) {
            advancedMediaPlayer.playMp4(filePath);
        } else if("MP3".equals(fileType)) {
            advancedMediaPlayer.playMp3(filePath);
        }
    }
}
