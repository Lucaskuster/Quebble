package nl.han.ooad.quebble.database;

import nl.han.ooad.quebble.service.*;

import java.util.ArrayList;

public class DatabaseVragen {

    public ArrayList<OpenVraag> getOpenVragen() {
        ArrayList<OpenVraag> openVragen = new ArrayList<>();
        openVragen.add(new OpenVraag(0, "Wat is 1 + 1?", "n", getOpenVraagAntwoorden(0)));
        openVragen.add(new OpenVraag(1, "Wat is 2 + 2?", "e", getOpenVraagAntwoorden(1)));
        openVragen.add(new OpenVraag(2, "Wat is 3 + 3?", "r", getOpenVraagAntwoorden(2)));
        openVragen.add(new OpenVraag(3, "Wat is 4 + 4?", "s", getOpenVraagAntwoorden(3)));
        openVragen.add(new OpenVraag(4, "Wat is 5 + 5?", "s", getOpenVraagAntwoorden(4)));
        openVragen.add(new OpenVraag(5, "Wat is 6 + 6?", "c", getOpenVraagAntwoorden(5)));
        openVragen.add(new OpenVraag(6, "Wat is 7 + 7?", "h", getOpenVraagAntwoorden(6)));
        openVragen.add(new OpenVraag(7, "Wat is 8 + 8?", "e", getOpenVraagAntwoorden(7)));
        return openVragen;
    }

    public ArrayList<OpenVraagAntwoord> getOpenVraagAntwoorden(int vraag) {
        ArrayList<OpenVraagAntwoord> openVraagAntwoorden = new ArrayList<>();

        switch (vraag) {
            case 0:
                openVraagAntwoorden.add(new OpenVraagAntwoord("2"));
                openVraagAntwoorden.add(new OpenVraagAntwoord("twee"));
                break;
            case 1:
                openVraagAntwoorden.add(new OpenVraagAntwoord("4"));
                openVraagAntwoorden.add(new OpenVraagAntwoord("vier"));
                break;
            case 2:
                openVraagAntwoorden.add(new OpenVraagAntwoord("6"));
                openVraagAntwoorden.add(new OpenVraagAntwoord("zes"));
                break;
            case 3:
                openVraagAntwoorden.add(new OpenVraagAntwoord("8"));
                openVraagAntwoorden.add(new OpenVraagAntwoord("acht"));
                break;
            case 4:
                openVraagAntwoorden.add(new OpenVraagAntwoord("10"));
                openVraagAntwoorden.add(new OpenVraagAntwoord("tien"));
                break;
            case 5:
                openVraagAntwoorden.add(new OpenVraagAntwoord("12"));
                openVraagAntwoorden.add(new OpenVraagAntwoord("twaalf"));
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
        MeerkeuzeVragen.add(new MeerkeuzeVraag(0, "Welke kleur heeft de lucht?",                    "s", new MeerkeuzeAntwoord("blauw"), getFouteAntwoorden(0)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(1, "Hoeveel jaar bestaat de HAN?",                   "c", new MeerkeuzeAntwoord("25"), getFouteAntwoorden(1)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(2, "Met welk cijfer wordt dit project beoordeeld?",  "a", new MeerkeuzeAntwoord("10"), getFouteAntwoorden(2)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(3, "Waar woont Olav vanaf 1 februari?",              "n", new MeerkeuzeAntwoord("nijmegen"), getFouteAntwoorden(3)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(4, "Wanneer is de Open Dag voltijd van de HAN?",     "l", new MeerkeuzeAntwoord("27 maart"), getFouteAntwoorden(4)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(5, "Waarom kies je voor HBO-ICT aan de HAN?",        "p", new MeerkeuzeAntwoord("de albert heijn is op loop afstand"), getFouteAntwoorden(5)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(6, "In computerprogramma’s en op websites worden wel eens verborgen extra’s gestopt. Welke Engelse term wordt gebruikt voor dit soort extra’s?", "e", new MeerkeuzeAntwoord("easter egg"), getFouteAntwoorden(6)));
        MeerkeuzeVragen.add(new MeerkeuzeVraag(7, "In welke provincie ligt Tiel?",                  "n", new MeerkeuzeAntwoord("gelderland"), getFouteAntwoorden(7)));
        return MeerkeuzeVragen;
    }

    private String[] getFouteAntwoorden(int vraag) {
        switch (vraag) {
            case 0:
                return new String[]{"blauw maar iets donkerder", "andere kleur blauw", "strikvraag de kleur heeft geen lucht"};
            case 1:
                return new String[]{"20", "15", "30"};
            case 2:
                return new String[]{"9.9", "1.0", "is niet te beoordelen met een cijfer"};
            case 3:
                return new String[]{"strik vraag, hij woont al een tijdje in Urk", "bemmel", "harare"};
            case 4:
                return new String[]{"daar is de han mee gestopt", "10 maart", "2 juni"};
            case 5:
                return new String[]{"leren in teams staat centraal", "internationaal georiënteerd", "praktisch onderzoek met informatica"};
            case 6:
                return new String[]{"hidden feature", "bug", "geheimpje"};
            case 7:
                return new String[]{"overijssel", "tiel", "noordrijn-westfalen"};
        }
        return null;
    }
}
