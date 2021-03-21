package nl.han.ooad.quebble.service;

public abstract class Vraag {
    private final int VRAAG_ID;
    private final String VRAAG;
    private final String LETTER;

    public Vraag(int vraagId, String vraag, String letter){
        this.VRAAG_ID = vraagId;
        this.VRAAG = vraag;
        this.LETTER = letter;
    }

    public int getVraagId() {
        return VRAAG_ID;
    }

    public String getVraag() {
        return VRAAG;
    }

    public String getLetter() {
        return LETTER;
    }


}
