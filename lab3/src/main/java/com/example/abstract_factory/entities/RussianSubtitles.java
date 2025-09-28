package com.example.abstract_factory.entities;

import com.example.abstract_factory.interfaces.Subtitles;

public class RussianSubtitles implements Subtitles {

    @Override
    public void display() {
        System.out.println("Displaying russian subtitles");
    }
    
}
