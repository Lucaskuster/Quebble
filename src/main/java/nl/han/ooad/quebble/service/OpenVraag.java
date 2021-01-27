package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class OpenVraag extends Vraag {

    private ArrayList<OpenVraagAntwoord> antwoorden;

    public OpenVraag(int vraagId, String vraag, String letter, ArrayList<OpenVraagAntwoord> antwoorden) {
        super(vraagId, vraag, letter);
        this.antwoorden = antwoorden;
    }

    public ArrayList<OpenVraagAntwoord> getAntwoorden() {
        return antwoorden;
    }

    public void setAntwoorden(ArrayList<OpenVraagAntwoord> antwoorden) {
        this.antwoorden = antwoorden;
    }

}
