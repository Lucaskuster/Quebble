package nl.han.ooad.quebble.service;

import nl.han.ooad.quebble.database.DatabaseSpelers;

import java.util.ArrayList;

public class Speler {
    private static final DatabaseSpelers DATABASE_SPELERS = new DatabaseSpelers();
    private final String GEBRUIKERSNAAM;
    private final String WACHTWOORD;
    private int credits;
    private ArrayList<Integer> gespeeldeQuizzes;

    private final int START_CREDITS = 1000;
    private final int KOSTEN_QUIZ = 40;

    public Speler(String gebruikersnaam, String wachtwoord) {
        this.GEBRUIKERSNAAM = gebruikersnaam;
        this.WACHTWOORD = wachtwoord;
        this.gespeeldeQuizzes =  new ArrayList<>();
        this.credits = START_CREDITS;
    }

    public static Speler getSpeler(String gebruikersnaam){
        ArrayList<Speler> spelers = DATABASE_SPELERS.getSpelers();
        for (Speler speler:spelers){
            if (gebruikersnaam.equals(speler.getGebruikersnaam())){
                return speler;
            }
        }
        return null;
    }

    public static void addSpeler(String gebruikersnaam, String wachtwoord){
        if (getSpeler(gebruikersnaam) == null){
            var speler = new Speler(gebruikersnaam, wachtwoord);
            DATABASE_SPELERS.addSpeler(speler);
        }
    }

    public ArrayList<Integer> getGespeeldeQuizzes() {
        return gespeeldeQuizzes;
    }

    public void addGespeeldeQuizzes(int quizId) {
        this.gespeeldeQuizzes.add(quizId);
    }

    public String getGebruikersnaam() {
        return GEBRUIKERSNAAM;
    }

    public String getWachtwoord() {
        return WACHTWOORD;
    }

    public int getCredits() {
        return credits;
    }

    public void verminderCredits() {
        this.credits = credits - KOSTEN_QUIZ;
    }

}
