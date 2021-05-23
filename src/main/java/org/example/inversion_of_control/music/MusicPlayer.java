package org.example.inversion_of_control.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    // DI via field
//    @Autowired
    private ClassicalMusic classicalMusic;
    private JazzMusic jazzMusic;

    // DI via constructor
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.jazzMusic = jazzMusic;
    }

    // DI via setter
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String playMusic(){
        return "Playing: " + classicalMusic.getSong();
    }
}
