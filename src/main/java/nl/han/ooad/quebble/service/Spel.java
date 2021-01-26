package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class Spel {
    private Quiz geselecteerdeQuiz;
    public Speler speler;
    private Score score;
    private ArrayList<String> letters;

    public void inloggen(String gebruikersnaam, String wachtwoord) {
        var speler = Speler.getSpeler(gebruikersnaam);

        if (speler != null) {
            if (speler.getWachtwoord().equals(wachtwoord)) {
                this.speler = speler;
                System.out.println();
                System.out.println("Inloggen voltooid");
                System.out.println("Welkom " + speler.getGebruikersnaam() + "!");
                System.out.println("U heeft nog " + speler.getCredits() + " credits.");
                System.out.println("U heeft " + speler.getGespeeldeQuizes().size() + " quizzen gespeeld.");
                System.out.println();
            } else {
                System.out.println("Wachtwoord onjuist");
            }
        } else {
            System.out.println("Gebruiker bestaat niet");
        }
    }

    public void registeren(String gebruikersnaam, String wachtwoord) {
        if (Speler.getSpeler(gebruikersnaam) == null) {
            Speler.addSpeler(gebruikersnaam, wachtwoord);
            System.out.println("Registratie voltooid");
        } else {
            System.out.println("Registratie mislukt, gebruikersnaam al in gebruik");
        }
    }

    public void SpeelSpel(Speler speler) {
//        this.geselecteerdeQuiz = Quiz.getEenQuiz(speler); // static gemaakt
//        this.score = new Score(); // denk eraan dat er een constructor is met creditstoevoegen
//
//        var vragen = geselecteerdeQuiz.getVragen();
//
//        var vraag = geselecteerdeQuiz.laatVraagZien();
//        System.out.println(vraag);
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
}
