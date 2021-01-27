package nl.han.ooad.quebble.database;

import nl.han.ooad.quebble.service.OpenVraag;
import nl.han.ooad.quebble.service.OpenVraagAntwoord;

import java.util.ArrayList;

public class DatabaseVragen {

    public void DatabaseVragen() {
        getOpenVragen();
    }

    public ArrayList<OpenVraag> getOpenVragen(){
        ArrayList<OpenVraag> openVragen = new ArrayList<>();
        OpenVraag openVraag1 = new OpenVraag(1, "Wat is 1 + 1?", "a", getOpenVraagAntwoorden(0));
        OpenVraag openVraag2 = new OpenVraag(2, "Wat is 2 + 2?", "b", getOpenVraagAntwoorden(1));
        OpenVraag openVraag3 = new OpenVraag(3, "Wat is 3 + 3?", "a", getOpenVraagAntwoorden(2));
        OpenVraag openVraag4 = new OpenVraag(4, "Wat is 4 + 4?", "b", getOpenVraagAntwoorden(3));
        OpenVraag openVraag5 = new OpenVraag(5, "Wat is 5 + 5?", "a", getOpenVraagAntwoorden(4));
        OpenVraag openVraag6 = new OpenVraag(6, "Wat is 6 + 6?", "b", getOpenVraagAntwoorden(5));
        openVragen.add(openVraag1);
        openVragen.add(openVraag2);
        openVragen.add(openVraag3);
        openVragen.add(openVraag4);
        openVragen.add(openVraag5);
        openVragen.add(openVraag6);
        return openVragen;
    }

    //TODO simplefy
    public ArrayList<OpenVraagAntwoord> getOpenVraagAntwoorden(int i){
        ArrayList<OpenVraagAntwoord> openVraagAntwoorden = new ArrayList<>();

        ArrayList<OpenVraagAntwoord> openVraagAntwoorden1 = new ArrayList<>();
        OpenVraagAntwoord openVraagAntwoord1 = new OpenVraagAntwoord("2");
        OpenVraagAntwoord openVraagAntwoord11 = new OpenVraagAntwoord("twee");
        openVraagAntwoorden1.add(openVraagAntwoord1);
        openVraagAntwoorden1.add(openVraagAntwoord11);

//        OpenVraagAntwoord openVraagAntwoord1 = new OpenVraagAntwoord();
        OpenVraagAntwoord openVraagAntwoord2 = new OpenVraagAntwoord(new String[]{"4", "vier"});
        OpenVraagAntwoord openVraagAntwoord3 = new OpenVraagAntwoord(new String[]{"6", "zes"});
        OpenVraagAntwoord openVraagAntwoord4 = new OpenVraagAntwoord(new String[]{"8", "acht"});
        OpenVraagAntwoord openVraagAntwoord5 = new OpenVraagAntwoord(new String[]{"10", "tien"});
        OpenVraagAntwoord openVraagAntwoord6 = new OpenVraagAntwoord(new String[]{"12", "twaalf"});
        openVraagAntwoorden.add(openVraagAntwoord1);
        openVraagAntwoorden.add(openVraagAntwoord2);
        openVraagAntwoorden.add(openVraagAntwoord3);
        openVraagAntwoorden.add(openVraagAntwoord4);
        openVraagAntwoorden.add(openVraagAntwoord5);
        openVraagAntwoorden.add(openVraagAntwoord6);
        return openVraagAntwoorden.get(i);
    }

//    public ArrayList<Integer> getQuizzesId() {
//        ArrayList<Integer> ids = new ArrayList<>();
//        for (Quiz quiz : quizzes) {
//            ids.add(quiz.getQuizId());
//        }
//        return ids;
//    }
//
//    public Quiz getQuiz(int quizId) {
//        for (Quiz quiz : quizzes) {
//            if (quiz.getQuizId() == quizId) {
//                return quiz;
//            }
//        }
//        return null;
//    }

}
