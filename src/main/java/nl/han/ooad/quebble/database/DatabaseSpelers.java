package nl.han.ooad.quebble.database;

import nl.han.ooad.quebble.service.Speler;

import java.util.ArrayList;

public class DatabaseSpelers {
     ArrayList<Speler> spelers = new ArrayList<>();

    public void DatabaseSpelers() {
        Speler speler1 = new Speler("Lucas", "Lucas");
        Speler speler2 = new Speler("Olav", "Olav");
        spelers.add(speler1);
        spelers.add(speler2);
    }

    public ArrayList<Speler> getSpelers() {
        return spelers;
    }

    public void addSpeler(Speler speler) {
        this.spelers.add(speler);
    }
}
