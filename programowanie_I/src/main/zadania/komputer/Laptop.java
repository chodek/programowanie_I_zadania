package zadania.komputer;

public class Laptop extends  Komputer{
    private double wielkoscMatrycy;
    private boolean czyPosiadaRetine;


    public Laptop(int potrzebnaMoc, String producent, TypProcesora typProcesora, double wielkoscMatrycy, boolean czyPosiadaRetine) {
        super(potrzebnaMoc, producent, typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.czyPosiadaRetine = czyPosiadaRetine;
    }

    public double getWielkoscMatrycy() {
        return wielkoscMatrycy;
    }

    public boolean isCzyPosiadaRetine() {
        return czyPosiadaRetine;
    }
}
