package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class Spel {
    public Quiz geselecteerdeQuiz;
    public Speler speler;
    private Score score;
    private ArrayList<String> letters;
    int vraagNummer;

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
        // TODO kan misschien weg
        this.score = new Score();
        this.vraagNummer = 0;
        this.letters = new ArrayList<>();
        this.geselecteerdeQuiz.laatVraagZien(vraagNummer);
        // TODO nadenken over het aanmaken van een score, deze wordt nu aangemaakt in Spel en niet in Quiz.
    }

    public void beantwoordVraag(String antwoordSpeler) {
        voegLetterToe(this.geselecteerdeQuiz.controleerAntwoord(antwoordSpeler, vraagNummer));
        vraagNummer++;
        if(vraagNummer < 8) {
            System.out.println();
            System.out.println("---------------------------------");
            geselecteerdeQuiz.laatVraagZien(vraagNummer);
        }
    }

    private void voegLetterToe(String letter) {
        letters.add(letter);
    }

    public void laatLettersZien(){
        String output = "";
        for (String letter: letters) {
            output = output.concat(letter + " - ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Dit zijn de letters van de goed beantwoordde vragen.");
        System.out.println(output);
        System.out.print("Een woord wat je hiermee kunt maken is: ");
    }

    public void controleerWoord(String gegevenWoord) {
        System.out.println("Dat is correct!! ");
        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||| - EINDE QUIZ - ||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
    }
}
