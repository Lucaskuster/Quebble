package nl.han.ooad.quebble;

import nl.han.ooad.quebble.service.Spel;

import java.util.Scanner;

public class Console {

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

    }

    private static void beantwoordVraagConsole() {


//        .beantwoordVraag()
    }

    private static void controleerWoordConsole() {

    }
}
