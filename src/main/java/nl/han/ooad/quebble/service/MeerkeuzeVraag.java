package nl.han.ooad.quebble.service;

public class MeerkeuzeVraag extends Vraag{
    private final MeerkeuzeAntwoord antwoord;

    private final String[] fouteAntwoorden;

    public MeerkeuzeVraag(int vraagId, String vraag, String letter, MeerkeuzeAntwoord antwoord, String[] fouteAntwoorden) {
        super(vraagId, vraag, letter);
        this.antwoord = antwoord;
        this.fouteAntwoorden = fouteAntwoorden;
    }

    public MeerkeuzeAntwoord getAntwoord() {
        return antwoord;
    }

    public String[] getFouteAntwoorden() {
        return fouteAntwoorden;
    }
}
