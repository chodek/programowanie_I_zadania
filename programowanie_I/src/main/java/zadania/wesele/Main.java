package zadania.wesele;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * To rozwiązanie opiera sie na kodzie stworzonym przez Eweline Fiedorowicz, many thanks!
 *
 * @author Ewelina Fiedorowicz
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilość zaproszonych osób: " + policzGosci(pobierzInformacjeOGosciach()));
    }

    public static int iloscZaproszen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile zaproszen?");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano nieprawidlową wartość, proszę podać liczbę większą od 0");
            return iloscZaproszen();

        }
    }

    public static Zaproszenie[] pobierzInformacjeOGosciach() {
        Scanner scanner = new Scanner(System.in);
        int liczbaZaproszen = iloscZaproszen();

        String imie;
        String nazwisko;
        TypZaproszenia typZaproszenia = null;
        String zaproszenie;

        Zaproszenie[] zaproszenia = new Zaproszenie[liczbaZaproszen];
        for (int i = 0; i < liczbaZaproszen; i++) {
            System.out.println("Podaj imie:");
            imie = scanner.next();

            System.out.println("Podaj nazwisko:");
            nazwisko = scanner.next();

            System.out.println("Czy zaproszenie jest z osobą towarszącą");
            zaproszenie = scanner.next();
            while (!zaproszenie.equalsIgnoreCase("tak") && !zaproszenie.equalsIgnoreCase("nie")) {
                System.out.println("Podałeś nieprawidłową odpowiedź, proszę odpowiedzieć TAK lub NIE.");
                zaproszenie = scanner.next();
            }
            if (zaproszenie.equalsIgnoreCase("tak")) {
                typZaproszenia = TypZaproszenia.Z_OS_TOWARZYSZACO;
            } else if (zaproszenie.equalsIgnoreCase("nie")) {
                typZaproszenia = TypZaproszenia.POJEDYNCZE;
            }

            zaproszenia[i] = new Zaproszenie(imie, nazwisko, typZaproszenia);
            System.out.println("Pomyślnie dodano zaproszenie!");
        }
        System.out.println(Arrays.toString(zaproszenia));
        return zaproszenia;
    }

    public static int policzGosci(Zaproszenie[] listaGosci) {
        int liczbaZaproszonych = 0;
        for (Zaproszenie zaproszenie : listaGosci
        ) {
            if (zaproszenie.typZaproszenia == TypZaproszenia.Z_OS_TOWARZYSZACO) {
                liczbaZaproszonych += 2;
            } else if (zaproszenie.typZaproszenia == TypZaproszenia.POJEDYNCZE) {
                liczbaZaproszonych++;
            }
        }
        return liczbaZaproszonych;

    }
}