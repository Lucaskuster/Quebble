package nl.han.ooad.quebble.service;

public class WoordControle {
    private String gegevenWoord;

    public boolean woordControle(String gegevenWoord) {
        this.gegevenWoord = gegevenWoord;
        IWoordControleAdapter adapter = new WoordControleAdapter();
        return adapter.woordControle(gegevenWoord);
    }

    public int getLengte(){
        return gegevenWoord.length();
    }
}
