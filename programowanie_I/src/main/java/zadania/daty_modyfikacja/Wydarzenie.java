package zadania.daty_modyfikacja;

import org.joda.time.DateTime;
import org.joda.time.Days;
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
        DateTime now = new DateTime();
        int days = Days.daysBetween(now.toLocalDate(), this.dataWydarzenia.toDateTimeFormat().toLocalDate()).getDays(); // Aby uzyc tego rozwiazania, do pom.xml dodalem dependency do bilbioteki Joda-Time ;)
        return days;
    }

}

