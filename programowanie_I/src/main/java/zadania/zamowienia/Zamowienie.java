package zadania.zamowienia;

import java.util.Arrays;

public class Zamowienie {
    private Pozycja[] pozycje;
    private int maksRozmiar;

    public Zamowienie() {
        maksRozmiar = 10;
        pozycje = new Pozycja[maksRozmiar];

    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        pozycje = new Pozycja[maksRozmiar];
    }

    public void dodajPozycje(Pozycja doDodania) {
        int count = 0;
        for (int i = 0; i < maksRozmiar; i++) {
            if (pozycje[i] != null) {
                count++;
            }
        }

        if (count == maksRozmiar) {
            System.out.println("Tablica pozycji pełna, nie możesz nic dodac!");
        } else {
            for (int i = 0; i < maksRozmiar; i++) {
                if (pozycje[i] == null) {
                    pozycje[i] = doDodania;
                    break;
                }
            }
            System.out.println("Pomyslnie dodano pozycje.");
        }
    }

    public double obliczWartosc() {
        double suma = 0;
        for (int i = 0; i < maksRozmiar; i++) {
            if (pozycje[i] != null) {
                suma += pozycje[i].obliczWartosc();
            }

        }
        return suma;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Zamowienie: \n");
        for (int i = 0; i < maksRozmiar; i++) {
            if (pozycje[i] != null) {
                stringBuilder.append(pozycje[i].toString() + "\n");
            }

        }
        stringBuilder.append("Razem: " + obliczWartosc() + " zł");
        return stringBuilder.toString();
    }
}
