package com.example.abstract_factory.entities;

import com.example.abstract_factory.interfaces.AudioTrack;

public class EnglishAudioTrack implements AudioTrack {

    @Override
    public void play() {
        System.out.println("Playing english audio");
    }
    
}
