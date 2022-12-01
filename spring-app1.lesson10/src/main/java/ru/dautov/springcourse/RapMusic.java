package ru.dautov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Оу щет мен, гад дэм";
    }
}
