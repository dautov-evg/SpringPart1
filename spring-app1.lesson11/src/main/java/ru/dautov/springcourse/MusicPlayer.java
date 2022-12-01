package ru.dautov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private Music music3;
    @Autowired
    public MusicPlayer(@Qualifier("rapMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("classicalMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + "\n" +
                "Playing: " + music2.getSong() + "\n" +
                "Playing: " + music3.getSong();


    }
}
