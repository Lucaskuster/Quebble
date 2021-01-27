package nl.han.ooad.quebble.service;

import nl.han.ooad.quebble.externelibrary.ExterneLibrary;

public class WoordControleAdapter implements IWoordControleAdapter {

    @Override
    public boolean woordControle(String gegevenWoord) {
        return ExterneLibrary.woordControle(gegevenWoord);
    }
}
