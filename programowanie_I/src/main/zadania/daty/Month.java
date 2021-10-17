package zadania.daty;

public enum Month {
    JANUARY("sty"),
    FEBRUARY("lut"),
    MARCH("mar"),
    APRIL("kwi"),
    MAY("maj"),
    JUNE("cze"),
    JULY("lip"),
    AUGUST("sie"),
    SEPTEMBER("wrz"),
    OCTOBER("paz"),
    NOVEMBER("lis"),
    DECEMBER("gru");

    private String shortcut;
    
    Month(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getShortcut() {
        return shortcut;
    }
}
