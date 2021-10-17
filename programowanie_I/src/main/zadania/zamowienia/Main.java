package zadania.zamowienia;

public class Main {
    public static void main(String[] args) {
        Zamowienie zamowienie = new Zamowienie();

        Pozycja pozycja1 = new Pozycja("Chleb", 2, 3.60);
        Pozycja pozycja2 = new Pozycja("Wino", 10, 25.70);

        zamowienie.dodajPozycje(pozycja1);
        zamowienie.dodajPozycje(pozycja2);

        System.out.println(zamowienie);

    }
}
