package ru.dautov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("SLIPKNOT");
        songs.add("SUM-41");
        songs.add("LINKIN PARK");
    }
    @Override
    public List<String> getSong() {
        return songs;
    }
}
