package zadania.komunikacja_miejska.pojazdy;

import zadania.komunikacja_miejska.zajezdnie.Zajezdnia;

public abstract class PojazdKomunikacjiMiejskiej extends Pojazd{
    protected int numer;
    protected Zajezdnia zajezdnia;

    public PojazdKomunikacjiMiejskiej(double predkoscMaksymalna, int numer, Zajezdnia zajezdnia) {
        super(predkoscMaksymalna);
        this.numer = numer;
        this.zajezdnia = zajezdnia;
    }

    @Override
    public String toString() {
        return "PojazdKomunikacjiMiejskiej{" +
                "numer=" + numer +
                ", zajezdnia=" + zajezdnia +
                ", predkoscMaksymalna=" + predkoscMaksymalna +
                '}';
    }
}
