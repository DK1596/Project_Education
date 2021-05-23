package org.example;

import org.example.inversion_of_control.music.MP3Player;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("jazzMusic", Music.class);
//
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//
//        musicPlayer2.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        MP3Player mp3Player = context.getBean("mp3", MP3Player.class);
        System.out.println(mp3Player.toString());

        context.close();
    }
}
