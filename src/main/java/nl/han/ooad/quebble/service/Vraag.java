package nl.han.ooad.quebble.service;

public abstract class Vraag {
    private int vraagId;
    private String vraag;
    private String letter;
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

    public boolean isActief() {
        return actief;
    }

    public void setActief(boolean actief) {
        this.actief = actief;
    }
}
