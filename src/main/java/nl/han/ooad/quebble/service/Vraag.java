package nl.han.ooad.quebble.service;

public abstract class Vraag {
    private final int vraagId;
    private final String vraag;
    private final String letter;
    private boolean actief;

    public Vraag(int vraagId, String vraag, String letter){
        this.vraagId = vraagId;
        this.vraag = vraag;
        this.letter = letter;
        this.actief = true;
    }

    public int getVraagId() {
        return vraagId;
    }

    public String getVraag() {
        return vraag;
    }

    public String getLetter() {
        return letter;
    }


}
