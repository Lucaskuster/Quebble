package nl.han.ooad.quebble;

import nl.han.ooad.quebble.service.Spel;

import java.util.Scanner;

public class Console {
    Spel spel = new Spel();

    public static void main(String[] args) {
        var console = new Console();
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
                    console.registrerenConsole();
                    break;
                case "2":
                    console.inloggenConsole();
                    break;
                case "3":
                    console.speelSpelConsole();
                    break;
                case "4":
                    stoppen = true;
                    break;
            }

            // speelSpel: speler

            // beantwoordVraag: antwoordspeler

            // controleerWoord: gegevenWoord
        }
        while (!stoppen);
    }

    private void inloggenConsole() {
        Scanner input = new Scanner(System.in);
        System.out.println("Log in");
        System.out.print("Gebruikersnaam: ");
        var gebruikersnaam = input.next();
        System.out.print("Wachtwoord: ");
        var wachtwoord = input.next();

        spel.inloggen(gebruikersnaam, wachtwoord);

        // fout en mogelijkheid om account aan te maken.


        System.out.println("login succes");
    }

    // Er wordt niet gecontroleerd op bestaande account, dit is geen requirement.
    private void registrerenConsole() {
        Scanner input = new Scanner(System.in);
        System.out.println("registreer");
        System.out.print("Gebruikersnaam: ");
        var gebruikersnaam = input.next();
        System.out.print("Wachtwoord: ");
        var wachtwoord = input.next();
        spel.registeren(gebruikersnaam, wachtwoord);
    }

    private void speelSpelConsole() {

    }

    private static void beantwoordVraagConsole() {


//        .beantwoordVraag()
    }

    private static void controleerWoordConsole() {

    }
}
