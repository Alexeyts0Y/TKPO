package com.example.abstract_factory.factories;

import com.example.abstract_factory.entities.RussianAudioTrack;
import com.example.abstract_factory.entities.RussianSubtitles;
import com.example.abstract_factory.interfaces.AudioTrack;
import com.example.abstract_factory.interfaces.FilmFactory;
import com.example.abstract_factory.interfaces.Subtitles;

public class RussianFilmFactory implements FilmFactory {
    
    @Override
    public AudioTrack createAudioTrack() {
        return new RussianAudioTrack();
    }

    @Override
    public Subtitles createSubtitles() {
        return new RussianSubtitles();
    }
    
}
