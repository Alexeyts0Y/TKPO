package com.example.abstract_factory.factories;

import com.example.abstract_factory.entities.EnglishAudioTrack;
import com.example.abstract_factory.entities.EnglishSubtitles;
import com.example.abstract_factory.interfaces.AudioTrack;
import com.example.abstract_factory.interfaces.FilmFactory;
import com.example.abstract_factory.interfaces.Subtitles;

public class EnglishFilmFactory implements FilmFactory {
    
    @Override
    public AudioTrack createAudioTrack() {
        return new EnglishAudioTrack();
    }

    @Override
    public Subtitles createSubtitles() {
        return new EnglishSubtitles();
    }
    
}
