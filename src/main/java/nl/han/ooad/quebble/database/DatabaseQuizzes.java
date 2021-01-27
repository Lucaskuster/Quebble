package nl.han.ooad.quebble.database;

import nl.han.ooad.quebble.service.Quiz;
import nl.han.ooad.quebble.service.Vraag;

import java.util.ArrayList;

public class DatabaseQuizzes {
    ArrayList<Quiz> quizzes = new ArrayList<>();

    public void DatabaseQuizzes() {
        Quiz quiz1 = new Quiz(1, vragen());
        Quiz quiz2 = new Quiz(2, vragen());
        Quiz quiz3 = new Quiz(3, vragen());
        quizzes.add(quiz1);
        quizzes.add(quiz2);
        quizzes.add(quiz3);
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

    private ArrayList<Vraag> vragen() {
        ArrayList<Vraag> vragen = new ArrayList<>();
        return vragen;
    }
}
