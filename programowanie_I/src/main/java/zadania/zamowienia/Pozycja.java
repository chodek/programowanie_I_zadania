package zadania.zamowienia;

public class Pozycja {
    private String nazwaTowaru;
    private int iloscSztuk;
    private double cenaSztuki;

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public double obliczWartosc() {
        return iloscSztuk * cenaSztuki;
    }

    @Override
    public String toString() {
        return nazwaTowaru + "\t" +
                cenaSztuki + " zł" + "\t" +
                iloscSztuk + " szt." + "\t" +
                obliczWartosc() + " zł";
    }
}
