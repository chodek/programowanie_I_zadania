package zadania.daty_modyfikacja;

import zadania.daty.MojaData;

public class Main {
    public static void main(String[] args) {
        MojaData mojaDataWydarzenia = new MojaData(1,11,2020);
        Wydarzenie wydarzenie = new Wydarzenie(mojaDataWydarzenia, "Swieto zmarlych");
        System.out.println("Do wydarzenia pozostało " + wydarzenie.ileZostaloLat() + " lat.");
        System.out.println("Do wydarzenia pozostało " + wydarzenie.ileZostaloMiesiecy() + " miesiecy.");
        System.out.println("Do wydarzenia pozostało " + wydarzenie.ileZostaloDni() + " dni.");

    }
}
