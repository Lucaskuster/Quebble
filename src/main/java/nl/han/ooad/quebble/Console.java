package nl.han.ooad.quebble;

import nl.han.ooad.quebble.service.Spel;

import java.util.Scanner;

public class Console {

    //TODO controleren of het gebruik van static klassen ook is opgenomen in de documenten
    //TODO spel is niet static dus het klasse diagram moet aangepast worden, in console gebruiken we telkens een instantie spel

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

        //TODO speelSpel in de documentatie veranderen naar speelQuiz.
        spel.speelQuiz();

        for(int i = 0; i < 8; i++) {
            beantwoordVraagConsole(spel);
        }

        spel.laatLettersZien();
        controleerWoordConsole(spel);
    }

    private static void beantwoordVraagConsole(Spel spel) {
        Scanner input = new Scanner(System.in);
        spel.beantwoordVraag(input.nextLine());
    }

    private static void controleerWoordConsole(Spel spel) {
        Scanner input = new Scanner(System.in);
        spel.controleerWoord(input.next());
    }


    //TODO todo's weg werken
    //TODO gelijk maken aan diagrammen


    //TODO code opschonen
    //TODO score wegwerken of opschonen
    //TODO library wegwerken of opschonen

    // TODO moeten we niet kijken naar het soort antwoord? dus bij een meerkeuze ook meerdere antwoorden goed laten zijn?


    // TODO Olav, ik heb in deze versie ook alle methoden weggehaald die niet in gebruik waren.
}
