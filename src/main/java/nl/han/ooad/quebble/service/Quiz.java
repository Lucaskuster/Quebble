package nl.han.ooad.quebble.service;

import nl.han.ooad.quebble.database.DatabaseQuizzes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class Quiz {
    private static DatabaseQuizzes databaseQuizzes = new DatabaseQuizzes();
    private int quizId;
    private ArrayList<Vraag> vragen;
    private Vraag vraag;

    public Quiz(int quizId, ArrayList<Vraag> vragen) {
        this.quizId = quizId;
        this.vragen = vragen;

    }

    // TODO op dit moment zijn de methode's getEenQuiz en selecteerQuiz methode's met namen die ongeveer hetzelfde betekenen. Dit heb ik aangepast
    public static Quiz getEenQuiz(Speler speler) {
        databaseQuizzes.DatabaseQuizzes();

        var gespeeldeQuizzesId = speler.getGespeeldeQuizzes();
        var beschikbareQuizzesId = databaseQuizzes.getQuizzesId();

        List<Integer> quizzes = beschikbareQuizzesId.stream()
                .filter(element -> !gespeeldeQuizzesId.contains(element))
                .collect(Collectors.toList());
        var quiz = databaseQuizzes.getQuiz(quizzes.get(0));

        speler.addGespeeldeQuizzes(quiz.getQuizId());

        // TODO diagrammen aanpassen, want ik roep deze later aan als in het sequence diagram.
        speler.verminderCredits();

        return quiz;
    }

    public int getQuizId() {
        return quizId;
    }

//
//    public String laatVraagZien(){
//        return vraag.getVraag();
//    }
//
//    public String controleerAntwoord(String antwoordSpeler){
//        var antwoord = vraag.getAntwoord();
//        var letter = "";
//        if(antwoord.equals(antwoordSpeler)){
//            letter = vraag.getLetter();
//        }
//        return letter;
//    }
//    //                          deze methoden weghalen uit diagrammen
////    public String getLetter(int vraagId) {
////
////    }
////
//    public ArrayList<Vraag> getVragen(){
//        var vragen = new ArrayList<Vraag>();
//        var vraag = new Vraag();
//        vragen.add(vraag);
//        return vragen;
//    }
}
