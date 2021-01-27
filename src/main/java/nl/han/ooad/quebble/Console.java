package nl.han.ooad.quebble;

import nl.han.ooad.quebble.service.Spel;

import java.util.Scanner;

public class Console {

    //TODO controleren of het gebruik van static klassen ook is opgenomen in de documenten

    //TODO spel is niet static dus het klasse diagram moet aangepast worden, in console gebruiken we telkens een instantie spel

    //TODO na het spelen van 3 quizzen krijg je een foutmelding, omdat er maar 2 quizzen zijn.

    //TODO meer soutjes naar de 'front-end' krijgen

    public static void main(String[] args) {
        var console = new Console();
        Spel spel = new Spel();

        boolean stoppen = false;
        do {
            System.out.println("-------------------------------");
            System.out.println("- Om te registeren toets 1");
            System.out.println("- Om in te loggen toets 2");
            System.out.println("- Om spel te starten toets 3");
            System.out.println("- Om te stoppen toets 4");
            System.out.println("-------------------------------");

            Scanner input = new Scanner(System.in);
            switch (input.next()) {
                case "1":
                    console.registrerenConsole(spel);
                    break;
                case "2":
                    console.inloggenConsole(spel);
                    break;
                case "3":
                    if(spel.speler == null) {
                        System.out.println("Log eerst in.");
                    } else {
                        console.speelSpelConsole(spel);
                    }
                    break;
                case "4":
                    stoppen = true;
                    break;
            }
        }
        while (!stoppen);
    }

    private void inloggenConsole(Spel spel) {
        Scanner input = new Scanner(System.in);
        System.out.println("Log in");
        System.out.print("Gebruikersnaam: ");
        var gebruikersnaam = input.next();
        System.out.print("Wachtwoord: ");
        var wachtwoord = input.next();
        spel.inloggen(gebruikersnaam, wachtwoord);
    }

    private void registrerenConsole(Spel spel) {
        Scanner input = new Scanner(System.in);
        System.out.println("registreer");
        System.out.print("Gebruikersnaam: ");
        var gebruikersnaam = input.next();
        System.out.print("Wachtwoord: ");
        var wachtwoord = input.next();
        spel.registeren(gebruikersnaam, wachtwoord);
    }

    private void speelSpelConsole(Spel spel) {
        System.out.println();
        System.out.println("Veel plezier bij het spelen van de Quiz!");
        System.out.println();

        // haal een quiz op                     /\
            // maak een score                   /\
            // verminder credits                /\
            // voeg de gespeelde quiz toe aan gespeelde quizzes /\
            // start een timer                  /\
        //TODO speelSpel in de documentatie veranderen naar speelQuiz.
        spel.speelQuiz();

        // laat vraag zien          /\
        // beantwoord de vraag      /\
        // controleer antwoord      /\
        // voeg letter toe          /\
        // herhaal 8 keer           /\

        for(int i = 0; i < 8; i++) {
            beantwoordVraagConsole(spel);
        }

        // voeg aantal correcte vragen toe aan score    /\
        // laat letters zien                            /\

        spel.laatLettersZien();

        // maak woord                                      /\
        // controleer woord
        controleerWoordConsole(spel);

        // bereken score
    }

    private static void beantwoordVraagConsole(Spel spel) {
        Scanner input = new Scanner(System.in);
        spel.beantwoordVraag(input.nextLine());
    }

    private static void controleerWoordConsole(Spel spel) {
        Scanner input = new Scanner(System.in);
        spel.controleerWoord(input.next());
    }

    //TODO controleren dat de juiste letters zijn gebruikt.
    //TODO todo's weg werken
    //TODO code opschonen
    //TODO score
    //TODO library uitbreiden
    //TODO als quiz 2 gespeeld is weer beginnen bij quiz 1.
}
