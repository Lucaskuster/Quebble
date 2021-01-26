package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class Spel {
    private Quiz geselecteerdeQuiz;
    private Speler speler;
    private Score score;
    private ArrayList<String> letters;

    public void SpeelSpel(Speler speler) {
        this.geselecteerdeQuiz = Quiz.getEenQuiz(speler); // static gemaakt
        this.score = new Score(); // denk eraan dat er een constructor is met creditstoevoegen

        var vragen = geselecteerdeQuiz.getVragen();

        var vraag = geselecteerdeQuiz.laatVraagZien();
        System.out.println(vraag);
    }

    public void beantwoordVraag(String antwoordSpeler) {

    }

    public void voegLetterToe(String letter) {

    }

//    public String laatLettersZien(){ // vgm moet dit void worden
//
//    }

    public void controleerWoord(String gegevenWoord) {

    }

    //    public void registreren(){ niet van toepassing
//
//    }
//
    public void inloggen(String gebruikersnaam, String wachtwoord) {
        if (Speler.getSpeler(gebruikersnaam) != null) {
            this.speler = Speler.getSpeler(gebruikersnaam);
            System.out.println("Inloggen voltooid");
        } else {
            System.out.println("Inloggen mislukt");
        }
    }

    public void registeren(String gebruikersnaam, String wachtwoord) {
        if (Speler.getSpeler(gebruikersnaam) == null) {
            Speler.addSpeler(gebruikersnaam, wachtwoord);
            System.out.println("Registratie voltooid");
        } else {
            System.out.println("Registratie mislukt");
        }
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
