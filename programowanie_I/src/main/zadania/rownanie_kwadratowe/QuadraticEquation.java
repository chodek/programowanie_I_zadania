package zadania.rownanie_kwadratowe;
/**
 * To rozwiązanie opiera sie na kodzie stworzonym przez Eweline Fiedorowicz, many thanks!
 *
 * @author Ewelina Fiedorowicz
 */
public class QuadraticEquation {
    protected double a;
    protected double b;
    protected double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDelta() {
        double delta = Math.pow(b, 2) - (4 * a * c);
        return delta;
    }

    private double getX() {
        double x = ((-b) / (2 * a));
        return x;
    }

    private double getX1(double delta) {
        double x1 = ((-b) - Math.sqrt(delta)) / (2 * a);
        return x1;
    }

    private double getX2(double delta) {
        double x2 = ((-b) + Math.sqrt(delta)) / (2 * a);
        return x2;
    }

    public void calculateX() {
        double delta = getDelta();
        if (delta < 0) {
            System.out.println("Delta jest mniejsza od 0. Ta funkcja nie ma miejsc zerowych");
        } else if (delta == 0) {
            double x = getX();
            System.out.println("Delta jest równa 0. Funkcja posiada jedno miejsce zerowe: x1 = " + x);
        } else {
            double x1 = getX1(delta);
            double x2 = getX2(delta);
            System.out.println("Delta jest większa od 0. Funkcja posiada dwa miejsca zerowe: x1 = " + x1 + " oraz x2 = " + x2);
        }
    }


}