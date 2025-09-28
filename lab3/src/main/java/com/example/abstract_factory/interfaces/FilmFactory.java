package com.example.abstract_factory.interfaces;

public interface FilmFactory {
    
    AudioTrack createAudioTrack();
    Subtitles createSubtitles();
}
