package org.example.inversion_of_control.music;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("playing: " + music.getSong());
    }
}

// show in main
//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );
//
//        Music musicBean = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
//
//        musicPlayer.playMusic();
//
//        context.close();
