package org.example.structural.adapter.client;

import org.example.structural.adapter.adapter.MediaAdapter;
import org.example.structural.adapter.adapter.MediaPlayer;

import java.util.Arrays;

public class ThreeGPPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String fileType, String filePath) {
        fileType = fileType.toUpperCase();
        if("3GP".equals(fileType)) {
            System.out.println("Playing Trivial 3GP File");
        } else if(Arrays.asList("MP3","MP4").contains(fileType)){
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileType, filePath);
        }
    }
}
