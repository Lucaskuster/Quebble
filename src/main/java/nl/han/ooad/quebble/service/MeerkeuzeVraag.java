package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class MeerkeuzeVraag extends Vraag{
    private MeerkeuzeAntwoord antwoord;

    private String[] fouteAntwoorden;

    public MeerkeuzeVraag(int vraagId, String vraag, String letter, MeerkeuzeAntwoord antwoord, String[] fouteAntwoorden) {
        super(vraagId, vraag, letter);
        this.antwoord = antwoord;
        this.fouteAntwoorden = fouteAntwoorden;
    }

    public MeerkeuzeAntwoord getAntwoord() {
        return antwoord;
    }

    public void setAntwoord(MeerkeuzeAntwoord antwoord) {
        this.antwoord = antwoord;
    }

    public String[] getFouteAntwoorden() {
        return fouteAntwoorden;
    }

    public void setFouteAntwoorden(String[] fouteAntwoorden) {
        this.fouteAntwoorden = fouteAntwoorden;
    }
}
