package org.example.inversion_of_control.music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("org.example.inversion_of_control.music")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(jazzMusic(), classicalMusic());
    }

//    @Bean
//    public MP3Player mp3Player(){
//        return new MP3Player(musicPlayer());
//    }
}
