package nl.han.ooad.quebble.externelibrary;

public class ExterneLibrary {

    public static boolean woordControle(String gegevenWoord) {
        var controleWoord = gegevenWoord.toLowerCase().trim();
        String[] correcteWoorden = new String[]{"scanners", "schelpen"};

        for (String correcteWoord : correcteWoorden) {
            if(correcteWoord.equals(controleWoord)){
                return true;
            }
        }
        return false;
    }
}
