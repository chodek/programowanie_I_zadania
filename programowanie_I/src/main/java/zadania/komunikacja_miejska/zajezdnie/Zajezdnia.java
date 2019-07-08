package zadania.komunikacja_miejska.zajezdnie;

import zadania.komunikacja_miejska.pojazdy.Pojazd;

import java.util.List;

public abstract class Zajezdnia {
    protected String nazwa;
    List<Pojazd> listaPojazdow;

    public Zajezdnia(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setListaPojazdow(List<Pojazd> listaPojazdow) {
        this.listaPojazdow = listaPojazdow;
    }

    @Override
    public String toString() {
        return "Zajezdnia{" +
                "nazwa='" + nazwa + '\'' +
                ", listaPojazdow=" + listaPojazdow.toString() +
                '}';
    }
}
