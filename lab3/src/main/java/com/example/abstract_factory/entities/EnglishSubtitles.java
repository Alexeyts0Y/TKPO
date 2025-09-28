package com.example.abstract_factory.entities;

import com.example.abstract_factory.interfaces.Subtitles;

public class EnglishSubtitles implements Subtitles {

    @Override
    public void display() {
        System.out.println("Displaying english subtitles");
    }
    
}
