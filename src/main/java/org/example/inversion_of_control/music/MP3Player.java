package org.example.inversion_of_control.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mp3")
public class MP3Player {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public MP3Player(MusicPlayer musicPlayer) {
        this.id =  1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Mp3 player " + id + " " + musicPlayer.playMusic();
    }
}
