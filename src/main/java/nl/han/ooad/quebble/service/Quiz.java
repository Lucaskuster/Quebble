package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class Quiz {
    private int quizId;
    private ArrayList<Vraag> vragen;
    private Vraag vraag;

    public Quiz() {

    }

    public static Quiz getEenQuiz(Speler speler){
        var gespeeldeQuizes = speler.getGespeeldeQuizes();
        var geselecteerdeQuiz = selecteerQuiz(gespeeldeQuizes);
        speler.addGespeeldeQuizes(geselecteerdeQuiz.getQuizId());
        return geselecteerdeQuiz;
    }

    public static Quiz selecteerQuiz(ArrayList<Integer> gespeeldeQuizes){ //aanpassen in diagrammen en op private zetten, ook static gemaakt
        var quiz = new Quiz(); //In deze methode moet hij een bestaande quiz pakken uit de database
        return quiz;
    }

    private int getQuizId(){ // later toegevoegd
        return quizId;
    }

    public String laatVraagZien(){
        return vraag.getVraag();
    }

    public String controleerAntwoord(String antwoordSpeler){
        var antwoord = vraag.getAntwoord();
        var letter = "";
        if(antwoord.equals(antwoordSpeler)){
            letter = vraag.getLetter();
        }
        return letter;
    }
    //                          deze methoden weghalen uit diagrammen
//    public String getLetter(int vraagId) {
//
//    }
//
    public ArrayList<Vraag> getVragen(){
        var vragen = new ArrayList<Vraag>();
        var vraag = new Vraag();
        vragen.add(vraag);
        return vragen;
    }
}
