package ru.dautov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{


    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @Override
    public String getSong() {
        return "Оу щет мен, гад дэм";
    }
}
