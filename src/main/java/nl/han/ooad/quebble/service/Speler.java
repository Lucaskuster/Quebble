package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class Speler {
    private String gebruikersnaam;
    private String wachtwoord;
    private int credits;
    private ArrayList<Integer> gespeeldeQuizes;

    public Speler() {
        var gespeeldeQuizes = new ArrayList<Integer>();
        gespeeldeQuizes.add(1);
        this.gespeeldeQuizes = gespeeldeQuizes;
    }

    public ArrayList<Integer> getGespeeldeQuizes() {
        var gespeeldeQuizes = new ArrayList<Integer>(){};
        gespeeldeQuizes.add(1);
        return gespeeldeQuizes;
    }

    public void addGespeeldeQuizes(int quizId) {
        this.gespeeldeQuizes.add(quizId);
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setGespeeldeQuizes(ArrayList<Integer> gespeeldeQuizes) {
        this.gespeeldeQuizes = gespeeldeQuizes;
    }
}
