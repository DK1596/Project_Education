package org.example.inversion_of_control.music;

import java.util.ArrayList;
import java.util.List;

//@Component
public class JazzMusic implements Music{
    private List<String> listJazzMusics = new ArrayList<>();

    {
        listJazzMusics.add("Young");
        listJazzMusics.add("Old");
        listJazzMusics.add("Middle");
    }
    @Override
    public List<String> getSong() {
        return listJazzMusics;
    }
}
