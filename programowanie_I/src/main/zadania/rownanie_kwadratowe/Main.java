package zadania.rownanie_kwadratowe;

import java.util.Scanner;
/**
 * To rozwiązanie opiera sie na kodzie stworzonym przez Eweline Fiedorowicz, many thanks!
 *
 * @author Ewelina Fiedorowicz
 */
public class Main {
    public static void main(String[] args) {
        double[] variables = new double[3];
        variables = getVariables(variables);
        QuadraticEquation quadraticEquation = new QuadraticEquation(variables[0], variables[1], variables[2]);
        quadraticEquation.calculateX();
    }


    public static double[] getVariables(double[] variables) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać wartość zmiennej a: ");
        double a = scanner.nextDouble();
        while (a == 0) {
            System.out.println("Zmienna a nie może przyjmować wartości 0, proszę podać inną liczbę:");
            a = scanner.nextDouble();
        }
        variables[0] = a;
        System.out.println("Proszę podać wartość zmiennej b: ");
        double b = scanner.nextDouble();
        variables[1] = b;
        System.out.println("Proszę podać wartość zmiennej c: ");
        double c = scanner.nextDouble();
        variables[2] = c;
        return variables;
    }
}
