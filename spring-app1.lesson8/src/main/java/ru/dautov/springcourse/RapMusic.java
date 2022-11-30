package ru.dautov.springcourse;

public class RapMusic implements Music{
    private RapMusic() {}

    public static RapMusic getRapMusic() {
        return new RapMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void daMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Оу щет мен, гад дэм";
    }
}
