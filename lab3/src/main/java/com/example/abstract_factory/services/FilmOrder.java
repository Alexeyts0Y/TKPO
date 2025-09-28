package com.example.abstract_factory.services;

import com.example.abstract_factory.interfaces.AudioTrack;
import com.example.abstract_factory.interfaces.FilmFactory;
import com.example.abstract_factory.interfaces.Subtitles;

public class FilmOrder {
    
    private AudioTrack audio;
    private Subtitles subtitles;

    public void setFactory(FilmFactory factory) {
        this.audio = factory.createAudioTrack();
        this.subtitles = factory.createSubtitles();
    }

    public void playFilm() {
        audio.play();
        subtitles.display();
    }
}
