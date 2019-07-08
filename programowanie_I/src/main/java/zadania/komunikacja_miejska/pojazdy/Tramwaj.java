package zadania.komunikacja_miejska.pojazdy;

import zadania.komunikacja_miejska.zajezdnie.Zajezdnia;

public class Tramwaj extends PojazdKomunikacjiMiejskiej{
    private IloscWagonow iloscWagonow;

    public Tramwaj(double predkoscMaksymalna, int numer, Zajezdnia zajezdnia, IloscWagonow iloscWagonow) {
        super(predkoscMaksymalna, numer, zajezdnia);
        this.iloscWagonow = iloscWagonow;
    }

    public IloscWagonow getIloscWagonow() {
        return iloscWagonow;
    }

    @Override
    public String toString() {
        return "Tramwaj{" +
                "iloscWagonow=" + iloscWagonow +
                ", numer=" + numer +
                ", predkoscMaksymalna=" + predkoscMaksymalna +
                '}';
    }
}
