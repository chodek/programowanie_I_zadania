package zadania.student_modyfikacja_2;

public class Student {
    private int nrIndeksu;
    private String imie;
    private String nazwisko;
    private char plec; // Znaczek 'K' lub 'M' - stosowniej byłoby użyć tutaj enuma, jak już je poznamy.


    /*
     * konstruktor bezparametrowy
     */
    public Student() {
    }

    /*
     * konstruktor ze wszystkimi parametrami
     */
    public Student(int nrIndeksu, String imie, String nazwisko, char plec) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }


    /*
     * gettery i settery
     */

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public void przedstawSie() {
        System.out.println("Cześć! Jestem " + this.imie + " " + this.nazwisko + (this.plec == 'M' ? ", jestem mezczyzna" : ", jestem kobieta") + " i mój numer indeksu to: " + this.nrIndeksu + ".");
    }

}
