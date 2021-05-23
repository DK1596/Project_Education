package org.example.inversion_of_control.music;

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

    public void initMethod(){
        System.out.println("doing initialization");
    }

    public void destroyMethod(){
        System.out.println("doing destruction");
    }

    @Override
    public String getSong() {
        return "Symphony";
    }
}
