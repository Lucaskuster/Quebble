package nl.han.ooad.quebble.service;

public abstract class Antwoord {
    private final String juisteAntwoord;

    public Antwoord (String juisteAntwoord){
        this.juisteAntwoord = juisteAntwoord;
    }

    public String getAntwoord() {
        return juisteAntwoord;
    }
}
