package zadania.robot;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * To rozwiązanie opiera sie na kodzie stworzonym przez Eweline Fiedorowicz, many thanks!
 *
 * @author Ewelina Fiedorowicz
 */
public class Robot {
    protected int poziomBaterii = 100;
    protected String nazwaRobota;
    boolean czyWlaczony = false;


    public Robot(String nazwaRobota) {
        this.nazwaRobota = nazwaRobota;
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Podano niepoprawny znak, proszę podac liczbę!");
                System.out.println("Aby wyświetlić listę dostępnych poleceń wpisz na konsoli [0]");
            }
        }

    }

    public void przedstawRobota() {
        System.out.println("Oto Robot " + this.nazwaRobota + ". Ten Robot posiada następujące funkcje:\n");
        wypiszlistePolecen();
    }

    public void wypiszlistePolecen() {
        System.out.println("Krok lewą nogą. Aby wykonac ten ruch wpisz na konsoli [1]");
        System.out.println("Krok prawą nogą. Aby wykonac ten ruch wpisz na konsoli [2]");
        System.out.println("Ruch prawą ręką. Aby wykonac ten ruch wpisz na konsoli [3]");
        System.out.println("Ruch lewą ręką. Aby wykonac ten ruch wpisz na konsoli [4]");
        System.out.println("Podskok. Aby wykonac ten ruch wpisz na konsoli [5]");
        System.out.println("Włącz robota. Aby wykonac to polecenie wpisz na konsoli [6]");
        System.out.println("Wyłącz robota. Aby wykonac to polecenie wpisz na konsoli [7]");
        System.out.println("Naładuj robota. Aby wykonac to polecenie wpisz na konsoli [8]");
        System.out.println("Podaj poziom naładowania baterii. Aby wykonac to polecenie wpisz na konsoli [9]");
        getInput();
    }

    public void getInput() {
        System.out.println("Aby wyświetlić listę dostępnych poleceń wpisz na konsoli [0]");
        System.out.println("Podaj komendę:");
        RuchRobota ruchRobota = null;
        switch (getUserInput()) {
            case 1:
                ruchRobota = RuchRobota.KROK_LEWA;
                poruszRobotem(ruchRobota);
            case 2:
                ruchRobota = RuchRobota.KROK_PRAWA;
                poruszRobotem(ruchRobota);
            case 3:
                ruchRobota = RuchRobota.RUCH_REKA_LEWA;
                poruszRobotem(ruchRobota);
            case 4:
                ruchRobota = RuchRobota.RUCH_REKA_PRAWA;
                poruszRobotem(ruchRobota);
            case 5:
                ruchRobota = RuchRobota.SKOK;
                poruszRobotem(ruchRobota);
            case 6:
                wlaczRobota();
            case 7:
                wylaczRobota();
            case 8:
                naladujRobota();
            case 9:
                poziomBaterii();
            case 0:
                wypiszlistePolecen();
            default:
                System.out.println("Podałeś nieprawidłową komendę.");
                wypiszlistePolecen();
        }
    }

    public void poruszRobotem(RuchRobota ruchRobota) {
        if (this.czyWlaczony) {
            if (this.poziomBaterii > ruchRobota.getZuzycieBaterii()) {
                switch (ruchRobota) {
                    case KROK_LEWA:
                        System.out.println("Robot zrobił krok lewą nogą.");
                        break;
                    case KROK_PRAWA:
                        System.out.println("Robot zrobił krok prawą nogą.");
                        break;
                    case RUCH_REKA_LEWA:
                        System.out.println("Robot ruszył lewą ręką.");
                        break;
                    case RUCH_REKA_PRAWA:
                        System.out.println("Robot ruszył prawą ręką.");
                        break;
                    case SKOK:
                        System.out.println("Robot podskoczył.");
                        break;
                }
                this.poziomBaterii -= ruchRobota.getZuzycieBaterii();
            } else {
                System.out.println("Robot nie ma dość energii by wykonać ten " + ruchRobota + "!");
            }
        } else {
            System.out.println("Zanim wykonasz " + ruchRobota.toString().toLowerCase().replaceAll("_", " ") + " musisz włączyć Robota!");
        }
        getInput();
    }

    public void naladujRobota() {
        if (czyWlaczony == false) {
            if (poziomBaterii < 100) {
                System.out.println("Bateria naładowana do 100%");
                setPoziomBaterii(100); //setter?
            } else {
                System.out.println("Bateria już jest pełna!");
            }
        } else {
            System.out.println("Przed ładowaniem musisz wyłączyć Robota");
        }
        wypiszlistePolecen();
    }

    public void wlaczRobota() {
        if (czyWlaczony) {
            System.out.println("Robot jest już włączony");
        } else {
            setCzyWlaczony(true);
            System.out.println("Robot " + nazwaRobota + " został włączony");
        }
        getInput();
    }

    public void wylaczRobota() {
        if (!czyWlaczony) {
            System.out.println("Robot jest już wyłączony");
        } else {
            setCzyWlaczony(false);
            System.out.println("Robot został wyłączony");
        }
        getInput();
    }

    public void poziomBaterii() {
        System.out.println("Aktualny poziom baterii robota to: " + getPoziomBaterii() + "%.");
        getInput();
    }

    public int getPoziomBaterii() {
        return poziomBaterii;
    }

    public void setPoziomBaterii(int poziomBaterii) {
        this.poziomBaterii = poziomBaterii;
    }

    public void setCzyWlaczony(boolean czyWlaczony) {
        this.czyWlaczony = czyWlaczony;
    }
}