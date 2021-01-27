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

                System.out.print("U heeft " + speler.getGespeeldeQuizzes().size());
                if (speler.getGespeeldeQuizzes().size() == 1) {
                    System.out.print(" quiz ");
                } else {
                    System.out.print(" quizzen ");
                }
                System.out.println("gespeeld.");
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

    public void speelQuiz() {
        this.geselecteerdeQuiz = Quiz.getEenQuiz(speler);
        this.score = new Score();

        // loop vragen laten zien


        // TODO nadenken over het aanmaken van een score, deze wordt nu aangemaakt in Spel en niet in Quiz.
        // TODO dit hoeft niet meer, omdat spel een instantie is.
//        var vragen = geselecteerdeQuiz.getVragen();

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
