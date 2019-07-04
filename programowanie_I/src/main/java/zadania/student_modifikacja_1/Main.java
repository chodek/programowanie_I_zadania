package zadania.student_modifikacja_1;

import zadania.student.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nrIndeksu = 0;
        String imie = new String();
        String nawzisko = new String();
        char plec = ' ';

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w kreatorze studenta!");

        System.out.println("Podaj indeks studenta którego tworzysz:");
        boolean poprawneDane = false; // Tworzymy flage, ktora bedzie decydowac o tym, czy powinnismy wchodzic do petli while, czy nie.
        while (!poprawneDane) { // Zapetlamy fragment programu, aby kazac uzytkownikowi tak dlugo podawac dane, az wpisze poprawne.
            String wczytanaLinia = scanner.nextLine(); // Dlaczego nie scanner.nextInt() i zapisac od razu do inta? Zeby nie musiec zajmowac sie enterem ktory zostalby na koncu linii.
            if (wczytanaLinia.length() == 6) { // Sprawdzamy, czy wpisana wartosc ma 6 znakow.
                try {
                    nrIndeksu = Integer.parseInt(wczytanaLinia); // Tutaj moze zostac rzucony wyjatek, jezeli przekazemy do metody Strigna, ktorego nie da sie zamienic na inta.
                    poprawneDane = true; // Jesli dojdziemy do tej linii, to znaczy, ze linijka wyzej nie zwrocila bledu, wiec dane sa poprawne.
                } catch (NumberFormatException e) { // Ten wyjatek moze zostac rzucony przez metode parseInt(), jezeli przekazany String nie da sie zamienic na liczbe.
                    System.out.println("To co wpisales nie jest numerem indeksu! Wpisz poprawny numer indeksu:");
                }
            }else {
                System.out.println("To co wpisales nie jest numerem indeksu! Wpisz poprawny, 6-cio cyfrowy numer indeksu:");
            }
        }

        poprawneDane = false; // Ustawiamy flage znowu na false, aby moc wejsc do kolejnego while'a, tego ponizej.
        System.out.println("Podaj name studenta którego tworzysz:");
        while (!poprawneDane) { // Zapetlamy fragment programu, aby kazac uzytkownikowi tak dlugo podawac dane, az wpisze poprawne.
            String wczytanaLinia = scanner.nextLine();
            if (wczytanaLinia.length() <= 2 || wczytanaLinia.matches(".*\\d.*")) { // Jesli wpisany tekst jest krotszy lub rowny niz 2 znaki, badz zawiera cyfry, to nie jest poprawnym imieniem.
                System.out.println("To co wpisales nie jest imieniem! Wpisz poprawne name:");
            } else {
                poprawneDane = true; // Jesli dojdziemy do tej linii, to znaczy, ze dane sa poprawne, wiec mozemy ustawic name na wczytana wartosc i opuscic petle.
                imie = wczytanaLinia;
            }
        }

        poprawneDane = false; // Ustawiamy flage znowu na false, aby moc wejsc do kolejnego while'a, tego ponizej.
        System.out.println("Podaj nazwisko studenta którego tworzysz:");
        while (!poprawneDane) { // Zapetlamy fragment programu, aby kazac uzytkownikowi tak dlugo podawac dane, az wpisze poprawne.
            String wczytanaLinia = scanner.nextLine();
            if (wczytanaLinia.length() <= 2 || wczytanaLinia.matches(".*\\d.*")) { // Jesli wpisany tekst jest krotszy lub rowny niz 3 znaki, badz zawiera cyfry, to nie jest poprawnym nazwiskiem.
                System.out.println("To co wpisales nie jest nazwiskiem! Wpisz poprawne nazwisko:");
            } else {
                poprawneDane = true; // Jesli dojdziemy do tej linii, to znaczy, ze dane sa poprawne, wiec mozemy ustawic nazwisko na wczytana wartosc i opuscic petle.
                nawzisko = wczytanaLinia;
            }
        }

        poprawneDane = false; // Ustawiamy flage znowu na false, aby moc wejsc do kolejnego while'a, tego ponizej.
        System.out.println("Podaj plec (K lub M) studenta którego tworzysz:");
        while (!poprawneDane) { // Zapetlamy fragment programu, aby kazac uzytkownikowi tak dlugo podawac dane, az wpisze poprawne.
            String wczytanaLinia = scanner.nextLine();
            if (wczytanaLinia.length() != 1 || (wczytanaLinia.charAt(0) != 'K' && wczytanaLinia.charAt(0) != 'M')) { // Jesli wpisany tekst jest innej dlugosci niz 1 znak lub nie jest literą 'K' ani nie jest literą 'M', to nie jest poprawna plcia.
                System.out.println("To co wpisales nie jest plcia! Wpisz poprawna plec:");
            } else {
                poprawneDane = true; // Jesli dojdziemy do tej linii, to znaczy, ze dane sa poprawne, wiec mozemy ustawic plec na wczytana wartosc i opuscic petle.
                plec = wczytanaLinia.charAt(0);
            }
        }

        // Na tym etapie mam poprawnie uzupelnione wszystkie dane potrzebne do stworzenia studenta.
        Student student = new Student(nrIndeksu, imie, nawzisko, plec);

        // Wypiszmy utworzonego studenta uzywajac getterow.
        System.out.println("Stworzony student:");
        System.out.println("Indkes: " + student.getNrIndeksu());
        System.out.println("Imie: " + student.getImie());
        System.out.println("Nazwisko: " + student.getNazwisko());
        System.out.println("Plec: " + student.getPlec());

    }
}
