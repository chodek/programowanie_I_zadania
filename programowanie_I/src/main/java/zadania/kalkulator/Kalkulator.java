package zadania.kalkulator;

import java.util.Scanner;

public class Kalkulator {
    private double wynik = 0;


    public void dzialaj() {
        wypiszOpcje();
        while (true) {
            wczytajPolecenie();
            System.out.println("Twoj wynik to: " + wynik);
            System.out.println("Co chcesz zrobic?");
        }
    }

    private String wczytajPolecenie() {
        Scanner scanner = new Scanner(System.in);
        Double liczba = 0d;
        String[] wczytanaLinia = scanner.nextLine().split(" ");
        String komenda = wczytanaLinia[0].toLowerCase().trim();
        if (!komenda.equalsIgnoreCase("czysc")) {
            liczba = Double.parseDouble(wczytanaLinia[1]);
        }

        switch (komenda) {
            case "dodaj":
                dodaj(liczba);
                break;
            case "odejmij":
                odejmij(liczba);
                break;
            case "mnoz":
                mnoz(liczba);
                break;
            case "dziel":
                dziel(liczba);
                break;
            case "czysc":
                czysc();
                break;
        }
        return komenda;
    }

    private void dodaj(Double liczba) {
        wynik += liczba;
    }

    private void odejmij(Double liczba) {
        wynik -= liczba;
    }

    private void mnoz(Double liczba) {
        wynik *= liczba;
    }

    private void dziel(Double liczba) {
        if(liczba != 0){
            wynik /= liczba;
        } else {
            System.out.println("Nie dzielimy przez 0!");
        }
    }

    private void czysc() {
        wynik = 0;
    }

    public void wypiszOpcje() {
        System.out.println("Nasze opcje to:\n" +
                "- dodaj X\n" +
                "- odejmij X\n" +
                "- mnoż X\n" +
                "- dziel X\n" +
                "- czysc");
    }
}
