package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public abstract class Antwoord {
    private String juisteAntwoord;

    public Antwoord (String juisteAntwoord){
        this.juisteAntwoord = juisteAntwoord;
    }

    public String getAntwoord() {
        return juisteAntwoord;
    }
}
