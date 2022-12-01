package ru.dautov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("СКРИПТОНИТ");
        songs.add("ЖАК ЭНТОНИ");
        songs.add("ВТОРОЙ КА");
    }
    @Override
    public List<String> getSong() {
        return songs;
    }
}
