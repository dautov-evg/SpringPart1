package ru.dautov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RapMusic rapMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }

    //    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() + "\n" +
                "Playing: " + rockMusic.getSong() + "\n" +
                "Playing: " + rapMusic.getSong();


    }
}
