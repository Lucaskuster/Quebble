package nl.han.ooad.quebble.service;

public abstract class Antwoord {
    private final String JUISTE_ANTWOORD;

    public Antwoord (String juisteAntwoord){
        this.JUISTE_ANTWOORD = juisteAntwoord;
    }

    public String getAntwoord() {
        return JUISTE_ANTWOORD;
    }
}
