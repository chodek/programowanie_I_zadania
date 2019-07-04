package zadania.daty_modyfikacja;

import zadania.daty.MojaData;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Wydarzenie {
    MojaData dataWydarzenia;
    String nazwaWydarzenia;

    public Wydarzenie(MojaData dataWydarzenia, String nazwaWydarzenia) {
        this.dataWydarzenia = dataWydarzenia;
        this.nazwaWydarzenia = nazwaWydarzenia;
    }

    public int ileZostaloLat() {
        Date date = new Date();
        LocalDate today = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //Pobranie obecnej daty.
        return dataWydarzenia.getYears() - today.getYear();
    }

    public int ileZostaloMiesiecy() {
        Date date = new Date();
        LocalDate today = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yearsDiff = ileZostaloLat();
        int monthsDiff = Math.abs((dataWydarzenia.getMonths().ordinal() + 1) - today.getMonth().getValue());
        if (today.getDayOfMonth() > dataWydarzenia.getDays()) { // Jezeli obecny dzien miesiaca jest wiekszy niz dzien miesiaca w ktorym odbywa sie wydarzenie, to nie liczymy wtedy tego miesiaca (gdyz jest niepelny)
            monthsDiff--;
        }
        return yearsDiff * 12 + Math.abs(monthsDiff);
    }

    public int ileZostaloDni() {
        Date date = new Date();
        LocalDate today = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yearsDiff = ileZostaloLat();
        int leapYearsInYearsDiff = countLeapYears(this.dataWydarzenia, today);

        int monthsDiff = ileZostaloMiesiecy();
        return yearsDiff * 12 + Math.abs(monthsDiff);
    }

    private static int countLeapYears(MojaData dataWydarzenia, LocalDate today) {
        int count = 0;
        int startingYear, stopYear;
        if (dataWydarzenia.getMonths().ordinal() + 1 > 2) {
            startingYear = dataWydarzenia.getYears() + 1;
        } else {
            startingYear = dataWydarzenia.getYears();
        }
        if (today.getMonth().getValue() < 2) {
            stopYear = today.getYear() - 1;
        } else {
            stopYear = today.getYear();
        }
        for (int i = startingYear; i < stopYear; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                count++;
            }
        }
        return count;
    }
}

