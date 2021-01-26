package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class Vraag {
    private String vraag;
    private String letter;
    private ArrayList<Antwoord> antwoorden;
    private ArrayList<Antwoord> juisteAntwoorden;
    private Spel antwoordSpeler;
    private boolean actief;
    private int vraagId;

    //TODO vraag is nu een dto
    public Vraag(int vraagId, String vraag, String letter, ArrayList<Antwoord> antwoorden){
        this.vraagId = vraagId;
        this.vraag = vraag;
        this.letter = letter;
        this.antwoorden = antwoorden;
        // TODO ik heb nietActief veranderd door actief
        this.actief = true;
    }

    public int getVraagId() {
        return vraagId;
    }

    public void setVraagId(int vraagId) {
        this.vraagId = vraagId;
    }

    public String getVraag() {
        return vraag;
    }

    public void setVraag(String vraag) {
        this.vraag = vraag;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public ArrayList<Antwoord> getAntwoord() {
        return antwoorden;
    }

    public void setAntwoord(ArrayList<Antwoord> antwoorden) {
        this.antwoorden = antwoorden;
    }

    public Spel getAntwoordSpeler() {
        return antwoordSpeler;
    }

    public void setAntwoordSpeler(Spel antwoordSpeler) {
        this.antwoordSpeler = antwoordSpeler;
    }

    public boolean isActief() {
        return actief;
    }

    public void setActief(boolean actief) {
        this.actief = actief;
    }
}
