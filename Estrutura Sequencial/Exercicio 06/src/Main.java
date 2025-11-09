import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double a, b, c, area;


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três valores para o calculo das figuras!");
        System.out.println("Enter three values to calculate the figures!");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();

        area = (a * c) / 2;
        System.out.printf("TRIANGLE: %.3f%n", area);

        area =  3.14159 * (c * c);
        System.out.printf("CIRCLE: %.3f%n", area);

        area =  (a + b) / 2 * c;
        System.out.printf("TRAPEZE: %.3f%n", area);

        area =  b * b ;
        System.out.printf("SQUARE: %.3f%n", area);

        area =  a * b ;
        System.out.printf("RECTANGLE: %.3f%n", area);
    }
}