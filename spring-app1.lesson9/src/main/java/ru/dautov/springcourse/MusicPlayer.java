package ru.dautov.springcourse;

public class MusicPlayer {
    private Music music;

    //зависимость внедряется извне (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
