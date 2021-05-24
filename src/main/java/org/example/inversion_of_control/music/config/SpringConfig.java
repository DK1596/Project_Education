package org.example.inversion_of_control.music.config;

import org.example.inversion_of_control.music.Music;
import org.example.inversion_of_control.music.MusicPlayer;
import org.example.inversion_of_control.music.genre.ClassicalMusic;
import org.example.inversion_of_control.music.genre.JazzMusic;
import org.example.inversion_of_control.music.genre.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("org.example.inversion_of_control.music") -> Component, Autowired
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public List<Music> musicList (){
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), jazzMusic(), rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

//    @Bean
//    public MP3Player mp3Player(){
//        return new MP3Player(musicPlayer());
//    }
}
