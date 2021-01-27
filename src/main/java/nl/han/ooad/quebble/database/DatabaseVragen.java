package nl.han.ooad.quebble.database;

import nl.han.ooad.quebble.service.*;

import java.util.ArrayList;

public class DatabaseVragen {

    public ArrayList<OpenVraag> getOpenVragen() {
        ArrayList<OpenVraag> openVragen = new ArrayList<>();
        openVragen.add(new OpenVraag(0, "Wat is 1 + 1?", "N", getOpenVraagAntwoorden(0)));
        openVragen.add(new OpenVraag(1, "Wat is 2 + 2?", "E", getOpenVraagAntwoorden(1)));
        openVragen.add(new OpenVraag(2, "Wat is 3 + 3?", "R", getOpenVraagAntwoorden(2)));
        openVragen.add(new OpenVraag(3, "Wat is 4 + 4?", "S", getOpenVraagAntwoorden(3)));
        openVragen.add(new OpenVraag(4, "Wat is 5 + 5?", "S", getOpenVraagAntwoorden(4)));
        openVragen.add(new OpenVraag(5, "Wat is 6 + 6?", "C", getOpenVraagAntwoorden(5)));
        openVragen.add(new OpenVraag(6, "Wat is 7 + 7?", "H", getOpenVraagAntwoorden(6)));
        openVragen.add(new OpenVraag(7, "Wat is 8 + 8?", "E", getOpenVraagAntwoorden(7)));
        return openVragen;
    }

    //TODO simplefy
    public ArrayList<OpenVraagAntwoord> getOpenVraagAntwoorden(int vraag) {
        ArrayList<OpenVraagAntwoord> openVraagAntwoorden = new ArrayList<>();

        OpenVraagAntwoord openVraagAntwoord11 = new OpenVraagAntwoord("2");
        OpenVraagAntwoord openVraagAntwoord12 = new OpenVraagAntwoord("twee");
        OpenVraagAntwoord openVraagAntwoord21 = new OpenVraagAntwoord("4");
        OpenVraagAntwoord openVraagAntwoord22 = new OpenVraagAntwoord("vier");
        OpenVraagAntwoord openVraagAntwoord31 = new OpenVraagAntwoord("6");
        OpenVraagAntwoord openVraagAntwoord32 = new OpenVraagAntwoord("zes");
        OpenVraagAntwoord openVraagAntwoord41 = new OpenVraagAntwoord("8");
        OpenVraagAntwoord openVraagAntwoord42 = new OpenVraagAntwoord("acht");
        OpenVraagAntwoord openVraagAntwoord51 = new OpenVraagAntwoord("10");
        OpenVraagAntwoord openVraagAntwoord52 = new OpenVraagAntwoord("tien");
        OpenVraagAntwoord openVraagAntwoord61 = new OpenVraagAntwoord("12");
        OpenVraagAntwoord openVraagAntwoord62 = new OpenVraagAntwoord("twaalf");

        switch (vraag) {
            case 0:
                openVraagAntwoorden.add(openVraagAntwoord11);
                openVraagAntwoorden.add(openVraagAntwoord12);
                break;
            case 1:
                openVraagAntwoorden.add(openVraagAntwoord21);
                openVraagAntwoorden.add(openVraagAntwoord22);
                break;
            case 2:
                openVraagAntwoorden.add(openVraagAntwoord31);
                openVraagAntwoorden.add(openVraagAntwoord32);
                break;
            case 3:
                openVraagAntwoorden.add(openVraagAntwoord41);
                openVraagAntwoorden.add(openVraagAntwoord42);
                break;
            case 4:
                openVraagAntwoorden.add(openVraagAntwoord51);
                openVraagAntwoorden.add(openVraagAntwoord52);
                break;
            case 5:
                openVraagAntwoorden.add(openVraagAntwoord61);
                openVraagAntwoorden.add(openVraagAntwoord62);
                break;
            case 6:
                openVraagAntwoorden.add(new OpenVraagAntwoord("14"));
                openVraagAntwoorden.add(new OpenVraagAntwoord("veertien"));
                break;
            case 7:
                openVraagAntwoorden.add(new OpenVraagAntwoord("16"));
                openVraagAntwoorden.add(new OpenVraagAntwoord("zestien"));
                break;
        }
        return openVraagAntwoorden;
    }

    public ArrayList<MeerkeuzeVraag> getMeerkeuzeVragen() {
        ArrayList<MeerkeuzeVraag> MeerkeuzeVragen = new ArrayList<>();
        MeerkeuzeVragen.add(new MeerkeuzeVraag(0, "Welke kleur heeft de lucht?",                    "S", new MeerkeuzeAntwoord("Blauw"), getFouteAntwoorden(0)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(1, "Hoeveel jaar bestaat de HAN?",                   "C", new MeerkeuzeAntwoord("25"), getFouteAntwoorden(1)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(2, "Met welk cijfer wordt dit project beoordeeld?",  "A", new MeerkeuzeAntwoord("10"), getFouteAntwoorden(2)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(3, "Waar woont Olav vanaf 1 februari?",              "N", new MeerkeuzeAntwoord("Nijmegen"), getFouteAntwoorden(3)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(4, "Wanneer is de Open Dag voltijd van de HAN?",     "L", new MeerkeuzeAntwoord("27 maart"), getFouteAntwoorden(4)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(5, "Waarom kies je voor HBO-ICT aan de HAN?",        "P", new MeerkeuzeAntwoord("De Albert Heijn is op loop afstand"), getFouteAntwoorden(5)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(6, "In computerprogramma’s en op websites worden wel eens verborgen extra’s gestopt. Welke Engelse term wordt gebruikt voor dit soort extra’s?", "E", new MeerkeuzeAntwoord("Easter egg"), getFouteAntwoorden(6)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(7, "In welke provincie ligt Tiel?",                  "N", new MeerkeuzeAntwoord("Gelderland"), getFouteAntwoorden(7)));
        return MeerkeuzeVragen;
    }

    private String[] getFouteAntwoorden(int vraag) {
        switch (vraag) {
            case 0:
                return new String[]{"Blauw maar iets donkerder", "Andere kleur blauw", "Strikvraag de kleur heeft geen lucht"};
            case 1:
                return new String[]{"20", "15", "30"};
            case 2:
                return new String[]{"9.9", "1.0", "Is niet te beoordelen met een cijfer"};
            case 3:
                return new String[]{"Strik vraag, hij woont al een tijdje in Urk", "Bemmel", "Harare"};
            case 4:
                return new String[]{"Daar is de HAN mee gestopt", "10 maart", "2 juni"};
            case 5:
                return new String[]{"Leren in teams staat centraal", "Internationaal georiënteerd", "Praktisch onderzoek met informatica"};
            case 6:
                return new String[]{"Hidden feature", "Bug", "Geheimpje"};
            case 7:
                return new String[]{"Overijssel", "Tiel", "Noordrijn-Westfalen"};
        }
        return null;
    }
}
