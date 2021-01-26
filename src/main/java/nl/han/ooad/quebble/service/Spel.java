package nl.han.ooad.quebble.service;

import java.util.ArrayList;

public class Spel {
    private Quiz geselecteerdeQuiz;
    private Speler speler;
    private Score score;
    private ArrayList<String> letters;

    public void SpeelSpel(Speler speler){
        this.geselecteerdeQuiz = Quiz.getEenQuiz(speler); // static gemaakt
        this.score = new Score(); // denk eraan dat er een constructor is met creditstoevoegen

        var vragen = geselecteerdeQuiz.getVragen();

        var vraag = geselecteerdeQuiz.laatVraagZien();
        System.out.println(vraag);
    }

    public void beantwoordVraag(String antwoordSpeler){

    }

    public void voegLetterToe(String letter){

    }

//    public String laatLettersZien(){ // vgm moet dit void worden
//
//    }

    public void controleerWoord(String gegevenWoord){

    }

//    public void registreren(){ niet van toepassing
//
//    }
//
//    public void inloggen(){
//
//    }
}
