package zadania.komunikacja_miejska.pojazdy;

public enum IloscWagonow {
    JEDEN(1),
    DWA(2),
    TRZY(3);
    private int liczbaWagonow;

    public int getLiczbaWagonow() {
        return liczbaWagonow;
    }

    IloscWagonow(int liczba) {
        this.liczbaWagonow = liczba;
    }
}
