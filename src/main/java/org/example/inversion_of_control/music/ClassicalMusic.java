package org.example.inversion_of_control.music;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Symphony";
    }
}
