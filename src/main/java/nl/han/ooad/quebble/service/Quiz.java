package nl.han.ooad.quebble.service;

import nl.han.ooad.quebble.database.DatabaseQuizzes;
import nl.han.ooad.quebble.database.DatabaseVragen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class Quiz {
    private static DatabaseQuizzes databaseQuizzes = new DatabaseQuizzes();
    private static DatabaseVragen databaseVragen = new DatabaseVragen();
    private int quizId;

    private ArrayList<Vraag> vragen;

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


    public void laatVraagZien(int vraagId){
//        var vragen = databaseQuizzes.getQuiz(this.getQuizId());
//        var vraag = vragen.getVragen().get(vraagId);
//
//        vragen.databaseVragen.getMeerkeuzeVragen();
//        System.out.println(vraag.getVraag());
//        System.out.println(vraag.);
//        if(vraag.equals(MeerkeuzeVraag.class)){
//
//        }
    }

    public ArrayList<Vraag> getVragen() {
        return vragen;
    }

    public void setVragen(ArrayList<Vraag> vragen) {
        this.vragen = vragen;
    }
}
