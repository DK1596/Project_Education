package org.example.inversion_of_control.music;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
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
//    private Music music1;
//    private Music music2;
    private List<Music> musicList;


//    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
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

    public void playMusic(){
        Random random = new Random();
        int randomMusic = random.nextInt(3);
        int randomGenre = random.nextInt(musicList.size());

        System.out.println(musicList.get(randomGenre).getSong().get(randomMusic));

//        switch (enumMusic){
//            case ClassicalMusic:
//                System.out.println(music2.getSong().get(randomMusic));
//            case JazzMusic:
//                System.out.println(music1.getSong().get(randomMusic));
//            default:
//                System.out.println("Not found music");
//        }
//        if (enumMusic == EnumMusic.ClassicalMusic){
//            System.out.println(music2.getSong().get(randomMusic));
//        } else {
//            System.out.println(music1.getSong().get(randomMusic));
//        }
    }
}
