package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class Spel {
    private Quiz geselecteerdeQuiz;
    private Speler speler;
    private Score score;
    private ArrayList<String> letters;

    public void SpeelSpel(Speler speler){
        this.geselecteerdeQuiz = Quiz.getEenQuiz(speler); // static gemaakt
        this.score = new Score(); // denk eraan dat er een constructor is met creditstoevoegen

        var vragen = geselecteerdeQuiz.getVragen();

        var vraag = geselecteerdeQuiz.laatVraagZien();
        System.out.println(vraag);
    }

    public void beantwoordVraag(String antwoordSpeler){

    }

    public void voegLetterToe(String letter){

    }

//    public String laatLettersZien(){ // vgm moet dit void worden
//
//    }

    public void controleerWoord(String gegevenWoord){

    }

//    public void registreren(){ niet van toepassing
//
//    }
//
    public void inloggen(String gebruikersnaam, String wachtwoord){


        this.speler = Speler.getSpeler(gebruikersnaam);
    }

    public Gebruiker getAccount(String gebruikersnaam) {
        var wachtwoord = selectWachtwoord(gebruikersnaam);
        var saldo = selectSaldo(gebruikersnaam);
        return new Gebruiker(gebruikersnaam, wachtwoord, saldo);
    }

    private String selectWachtwoord(String naam) {
        if (naam == "Pieter") {
            return "WW";
        }
        return "";
    }

    private int selectSaldo(String naam) {
        if (naam == "Pieter") {
            return 1000;
        }
        return 0;
    }
}
