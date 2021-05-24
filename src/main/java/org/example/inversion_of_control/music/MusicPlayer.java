package org.example.inversion_of_control.music;

import org.example.inversion_of_control.music.enum_music.EnumMusic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    // DI via field
    private Music music1;
    private Music music2;

//    @Autowired
    public MusicPlayer(@Qualifier("jazzMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    // DI via constructor
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    // DI via setter
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void playMusic(EnumMusic enumMusic){
        Random random = new Random();
        int randomNumber = random.nextInt(3);

//        switch (enumMusic){
//            case ClassicalMusic:
//                System.out.println(music2.getSong().get(randomNumber));
//            case JazzMusic:
//                System.out.println(music1.getSong().get(randomNumber));
//            default:
//                System.out.println("Not found music");
//        }
        if (enumMusic == EnumMusic.ClassicalMusic){
            System.out.println(music2.getSong().get(randomNumber));
        } else {
            System.out.println(music1.getSong().get(randomNumber));
        }
    }
}
