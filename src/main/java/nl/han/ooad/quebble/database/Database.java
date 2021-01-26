package nl.han.ooad.quebble.database;

import nl.han.ooad.quebble.service.Speler;

import java.util.ArrayList;

public class Database {

    public ArrayList<Speler> spelers(){
        var spelers = new ArrayList<Speler>();
        Speler speler1 = new Speler("Lucas", "Lucas");
        Speler speler2 = new Speler("Olav", "Olav");
        spelers.add(speler1);
        spelers.add(speler2);
        return spelers;
    }
}
