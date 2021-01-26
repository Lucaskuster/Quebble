package nl.han.ooad.quebble;

import nl.han.ooad.quebble.service.Spel;

import java.util.Scanner;

public class Console {
    private static Spel spel = new Spel();

    public static void main(String[] args) {

        // inloggen: gebruikersnaam, wachtwoord

        // registreren: gebruikersnaam, wachtwoord

        // speelSpel: speler

        // beantwoordVraag: antwoordspeler

        // controleerWoord: gegevenWoord

        inloggenConsole();
    }

    private static void inloggenConsole() {
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
    private static void registrerenConsole() {
        Scanner input = new Scanner(System.in);
        System.out.println("registreer");
        System.out.print("Gebruikersnaam: ");
        var gebruikersnaam = input.next();
        System.out.print("Wachtwoord: ");
        var wachtwoord = input.next();

        // .registreer(gebruikersnaam, wachtwoord);

        System.out.println("registratie voltooid");
    }

    private static void speelSpelConsole() {

    }

    private static void beantwoordVraagConsole(){


        .beantwoordVraag()
    }

    private static void controleerWoordConsole(){

    }
}
