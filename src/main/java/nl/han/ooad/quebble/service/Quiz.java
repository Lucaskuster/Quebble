package nl.han.ooad.quebble.service;

import nl.han.ooad.quebble.database.DatabaseQuizzes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz {
    private final static DatabaseQuizzes databaseQuizzes = new DatabaseQuizzes();
    private final int quizId;
    private final ArrayList<Vraag> vragen;

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
        var vraag = this.vragen.get(vraagId);

        System.out.println(vraag.getVraag());
        if(vraag.getClass().equals(MeerkeuzeVraag.class)){
            var fouteAntwoorden = ((MeerkeuzeVraag) vraag).getFouteAntwoorden();

            for (String fouteAntwoord: fouteAntwoorden) {
                System.out.print(fouteAntwoord);
                System.out.print("   *   ");
            }

            var juisteAntwoord = ((MeerkeuzeVraag) vraag).getAntwoord();
            System.out.print( juisteAntwoord.getAntwoord());
            System.out.println();
        }
    }

    public String controleerAntwoord(String antwoordSpeler, int vraagId){
        var vraag = this.vragen.get(vraagId);

        if (vraag.getClass().equals(MeerkeuzeVraag.class)) {
            var antwoord = ((MeerkeuzeVraag) vraag).getAntwoord();
            if (antwoordSpeler.equals(antwoord.getAntwoord())) {
                return vraag.getLetter();
            }
        } else {
            var antwoorden = ((OpenVraag) vraag).getAntwoorden();
            if (antwoorden.stream().anyMatch(element -> element.getAntwoord().equals(antwoordSpeler))) {
                return vraag.getLetter();
            }
        }
        return "";
    }
}
