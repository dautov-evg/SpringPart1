package ru.dautov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private RapMusic rapMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(RapMusic rapMusic, RockMusic rockMusic) {
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }


    public void playMusic(MusicGen gen) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (gen==MusicGen.RAP) {
            System.out.println(rapMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }
}
