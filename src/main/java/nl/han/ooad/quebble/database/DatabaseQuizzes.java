package nl.han.ooad.quebble.database;

import nl.han.ooad.quebble.service.MeerkeuzeVraag;
import nl.han.ooad.quebble.service.OpenVraag;
import nl.han.ooad.quebble.service.Quiz;
import nl.han.ooad.quebble.service.Vraag;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class DatabaseQuizzes {
    ArrayList<Quiz> quizzes = new ArrayList<>();
    DatabaseVragen databaseVragen = new DatabaseVragen();

    public DatabaseQuizzes() {
        ArrayList<MeerkeuzeVraag> meerkeuzeVragen = databaseVragen.getMeerkeuzeVragen();
        ArrayList<OpenVraag> openVragen = databaseVragen.getOpenVragen();

        var meerkeuzeVragenQuiz1 = meerkeuzeVragen.stream()
                .filter(element -> element.getVraagId() <=3).collect(Collectors.toCollection(ArrayList::new));
        var meerkeuzeVragenQuiz2 = meerkeuzeVragen.stream()
                .filter(element -> element.getVraagId() > 3).collect(Collectors.toCollection(ArrayList::new));

        var openVragenQuiz1 = openVragen.stream()
                .filter(element -> element.getVraagId() <=3).collect(Collectors.toCollection(ArrayList::new));
        var openVragenQuiz2 = openVragen.stream()
                .filter(element -> element.getVraagId() > 3).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Vraag> vragenQuiz1 = new ArrayList<>();
        vragenQuiz1.addAll(meerkeuzeVragenQuiz1);
        vragenQuiz1.addAll(openVragenQuiz1);

        ArrayList<Vraag> vragenQuiz2 = new ArrayList<>();
        vragenQuiz2.addAll(meerkeuzeVragenQuiz2);
        vragenQuiz2.addAll(openVragenQuiz2);

        quizzes.add(new Quiz(1, vragenQuiz1));
        quizzes.add(new Quiz(2, vragenQuiz2));
    }

    public ArrayList<Integer> getQuizzesId() {
        ArrayList<Integer> ids = new ArrayList<>();
        for (Quiz quiz : quizzes) {
            ids.add(quiz.getQuizId());
        }
        return ids;
    }

    public Quiz getQuiz(int quizId) {
        for (Quiz quiz : quizzes) {
            if (quiz.getQuizId() == quizId) {
                return quiz;
            }
        }
        return null;
    }
}
