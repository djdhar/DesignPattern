package org.example.structural.adapter;

import org.example.structural.adapter.client.ThreeGPPlayer;

public class Driver {
    public static void main(String[] args) {
        ThreeGPPlayer threeGPPlayer = new ThreeGPPlayer();
        threeGPPlayer.play("mp3","abc.mp3");
        threeGPPlayer.play("Mp4","abc.mp4");
        threeGPPlayer.play("3gP","abc.3gp");
    }
}
