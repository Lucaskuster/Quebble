package nl.han.ooad.quebble.service;

public class WoordControle {

    public boolean woordControle(String gegevenWoord) {
        IWoordControleAdapter adapter = new WoordControleAdapter();
        return adapter.woordControle(gegevenWoord);
    }

}
