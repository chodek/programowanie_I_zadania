package zadania.komunikacja_miejska.zajezdnie;

import zadania.komunikacja_miejska.pojazdy.Autobus;
import zadania.komunikacja_miejska.pojazdy.Pojazd;

public class ZajezdniaAutobusowa extends Zajezdnia {

    public ZajezdniaAutobusowa(String nazwa) {
        super(nazwa);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", sumaZuzytegoPaliwa=" + sumaZuzytegoPaliwa();

    }

    public double sumaZuzytegoPaliwa() {
        double sumaPaliwa = 0;

        for (Pojazd pojazd : listaPojazdow) {
            Autobus temp = (Autobus) pojazd;
            sumaPaliwa += temp.getZuzytePaliwoWMiesiacu();
        }
        return sumaPaliwa;
    }
}
