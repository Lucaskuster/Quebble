package nl.han.ooad.quebble.service;

import nl.han.ooad.quebble.database.Database;

import java.util.ArrayList;

public class Speler {
    private String gebruikersnaam;
    private String wachtwoord;
    private int credits;
    private ArrayList<Integer> gespeeldeQuizes;

    private final int START_CREDITS = 1000;
    private Database database = new Database();

    public Speler(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.gespeeldeQuizes =  new ArrayList<Integer>();
        this.credits = START_CREDITS;
    }

    public ArrayList<Integer> getGespeeldeQuizes() {
        var gespeeldeQuizes = new ArrayList<Integer>(){};
        gespeeldeQuizes.add(1);
        return gespeeldeQuizes;
    }

    public Speler getSpeler(String gebruikersnaam){
        ArrayList<Speler> spelers = database.spelers();
        for (Speler speler:spelers){
            if (gebruikersnaam.equals(speler.getGebruikersnaam())){
                return speler;
            }
        }
        return null;
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
