package nl.han.ooad.quebble.service;

public class MeerkeuzeVraag extends Vraag{
    private final MeerkeuzeAntwoord ANTWOORD;

    private final String[] FOUTE_ANTWOORDEN;

    public MeerkeuzeVraag(int vraagId, String vraag, String letter, MeerkeuzeAntwoord antwoord, String[] fouteAntwoorden) {
        super(vraagId, vraag, letter);
        this.ANTWOORD = antwoord;
        this.FOUTE_ANTWOORDEN = fouteAntwoorden;
    }

    public MeerkeuzeAntwoord getAntwoord() {
        return ANTWOORD;
    }

    public String[] getFouteAntwoorden() {
        return FOUTE_ANTWOORDEN;
    }
}
