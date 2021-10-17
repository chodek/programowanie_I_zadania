package zadania.robot;
/**
 * To rozwiązanie opiera sie na kodzie stworzonym przez Eweline Fiedorowicz, many thanks!
 *
 * @author Ewelina Fiedorowicz
 */
public enum RuchRobota {
    KROK_LEWA(4),
    KROK_PRAWA(4),
    RUCH_REKA_LEWA(3),
    RUCH_REKA_PRAWA(3),
    SKOK(8);

    protected int zuzycieBaterii;

    RuchRobota(int zuzycieBaterii) {
        this.zuzycieBaterii = zuzycieBaterii;
    }

    public int getZuzycieBaterii() {
        return zuzycieBaterii;
    }
}