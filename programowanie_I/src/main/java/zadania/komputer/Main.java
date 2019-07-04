package zadania.komputer;

public class Main {
    public static void main(String[] args) {
        // Stwórz kilka obiektów typu Laptop i typu Komputer.
        Komputer komputer1 = new Komputer(500, "Dell", TypProcesora.WIELORDZENIOWY);
        Komputer komputer2 = new Komputer(300, "HP", TypProcesora.JEDNORDZENIOWY);

        Laptop laptop1 = new Laptop(200, "Lenovo", TypProcesora.JEDNORDZENIOWY, 13.3, false);
        Laptop laptop2 = new Laptop(260, "Asus", TypProcesora.WIELORDZENIOWY, 15, true);

        // Umieść je w tablicy,
        Komputer[] tablicaKomputerow = new Komputer[]{komputer1, komputer2, laptop1, laptop2};

        // a następnie wypisz pętlą while.
        int i = 0;
        while (i < tablicaKomputerow.length) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sprzet w tablicy pod indeksem " + i + ": \n"
                    + "Potrzbena moc: " + tablicaKomputerow[i].getPotrzebnaMoc() + " "
                    + "Producent: " + tablicaKomputerow[i].getProducent() + " "
                    + "Typ: " + tablicaKomputerow[i].getTypProcesora());
            if (tablicaKomputerow[i] instanceof Laptop) {
                stringBuilder.append(" Wielkosc matrycy: " + ((Laptop) tablicaKomputerow[i]).getWielkoscMatrycy());
            }
            System.out.println(stringBuilder.toString());
            i++; // Samodzielnie zwiekszamy i, aby w nastepnym przebiegu petli odnosic sie do nastepnego komputera z tablicy.

        }
    }
}
