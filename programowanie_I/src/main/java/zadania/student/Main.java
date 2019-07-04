package zadania.student;

public class Main {
    public static void main(String[] args) {

        /* Stwórz 3 instancje obiektu student */
        Student adam = new Student(133454, "Adam", "Nowak", 'M');
        Student ewa = new Student(99404, "Ewa", "Kowalska", 'K');
        Student maciek = new Student();

        /* Co najmniej jednemu obiektowi ustaw parametry używając setterów. */
        maciek.setNrIndeksu(101233);
        maciek.setImie("Maciek");
        maciek.setNazwisko("Nowakowski");
        maciek.setPlec('M');


        /*  Wypisz ich parametry na ekran metodami getterów */
        System.out.println("Student 1: " + adam.getNrIndeksu() + ", name: " + adam.getImie() + ", nazwisko: " + adam.getNazwisko() + ", plec: " + adam.getPlec());
        System.out.println("Student 2: " + ewa.getNrIndeksu() + ", name: " + ewa.getImie() + ", nazwisko: " + ewa.getNazwisko() + ", plec: " + ewa.getPlec());
        System.out.println("Student 3: " + maciek.getNrIndeksu() + ", name: " + maciek.getImie() + ", nazwisko: " + maciek.getNazwisko() + ", plec: " + maciek.getPlec());

    }
}
