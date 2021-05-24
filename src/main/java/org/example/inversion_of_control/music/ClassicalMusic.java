package org.example.inversion_of_control.music;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private int volume;

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("doing initialization");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("doing destruction");
    }

    private List<String> listClassicalMusics = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        listClassicalMusics.add("Symphony");
        listClassicalMusics.add("Marsh");
        listClassicalMusics.add("Messiah");
    }

    @Override
    public List<String> getSong() {
        return listClassicalMusics;
    }
}
