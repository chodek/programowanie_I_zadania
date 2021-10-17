package zadania.daty;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class MojaData {
    private int days, years;
    private Month months;

    public MojaData(int days, int month, int years) {
        this.days = days;
        this.months = Month.values()[month - 1];
        this.years = years;
    }

    public void wyswietlDate() {
        System.out.println(this.days + "." + (this.months.ordinal() + 1) + "." + this.years);
    }

    public void wyswietlDate2() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.days < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(this.days);
        stringBuilder.append(".");
        if (this.months.ordinal() + 1 < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(this.months.ordinal() + 1);
        stringBuilder.append(".");
        stringBuilder.append(this.years);
        System.out.println(stringBuilder.toString());
    }

    public void wyswietlDate3() {
        System.out.println(this.days + " " + this.months.getShortcut() + " " + this.years);
    }

    public int getDays() {
        return days;
    }

    public int getYears() {
        return years;
    }

    public Month getMonths() {
        return months;
    }

    public DateTime toDateTimeFormat(){
        return DateTime.parse(""+this.getDays()+"/"+(this.getMonths().ordinal()+1)+"/"+this.getYears(), DateTimeFormat.forPattern("dd/MM/yyyy"));
    }
}
