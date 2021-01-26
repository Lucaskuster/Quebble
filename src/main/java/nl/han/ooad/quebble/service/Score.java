package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class Score{
    private ArrayList<String> letters;
    private IPuntentelling puntentelling;
    private IPuntentelling puntentellingStrategie;
    private int punten;
    private long tijdVanStarten;
    private long tijdVanStoppen;

    private int correcteVragen;
    private boolean woordCorrect;
    private int lengteWoord;

    public Score (){
        startTijd();
    }

    // start de tijd wanneer het spel gestart wordt
    public void startTijd() {
        this.tijdVanStarten = System.currentTimeMillis();
    }

    // stop de tijd wanneer het woord is gevormd door de speler
    public void stopTijd() {
        this.tijdVanStoppen = System.currentTimeMillis();
    }

//    public void setAantalCorrecteVragen(ArrayList<String> letters) {
//        this.letters = letters;
//    }
//
//    public void setWoordGegevens(boolean woordCorrect, int lengteWoord) {
//        this.woordCorrect = woordCorrect;
//        this.lengteWoord = lengteWoord;
//    }
//
//    public int berekenScore(IPuntentelling puntentelling) {
//        var puntenAantalVragenCorrect = puntentelling.getPuntenAantalVragenCorrect(correcteVragen);
//        var puntenVoorTijd = puntentelling.getPuntenOpTijd(tijd);
//        var puntenLengteWoord = puntentelling.getPuntenLengteWoord(lengteWoord);
//
//        var score = puntenAantalVragenCorrect + puntenVoorTijd + puntenLengteWoord;
//
//        return score;
//    }
//
//    public void setPuntentellingStrategie(IPuntentelling puntentellingStrategie) {
//        this.puntentellingStrategie = puntentellingStrategie;
//    }
//
//    public int getScore() {
//
//        return 0;
//    }
}
