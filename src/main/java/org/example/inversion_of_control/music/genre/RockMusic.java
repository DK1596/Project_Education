package org.example.inversion_of_control.music.genre;

import org.example.inversion_of_control.music.Music;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    private List<String> rockMusicLists = new ArrayList<>();

    {
        rockMusicLists.add("first");
        rockMusicLists.add("second");
        rockMusicLists.add("third");
    }


    @Override
    public List<String> getSong() {
        return rockMusicLists;
    }
}
