import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Enter the number of test cases you want.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double a, b, c;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter first number.");
            a = sc.nextDouble();
            System.out.println("Enter second number.");
            b = sc.nextDouble();
            System.out.println("Enter third number.");
            c = sc.nextDouble();

            double total = ((a * 2) + (b * 3) + (c * 5)) / 10;
            System.out.printf("Average %.1f%n", total);
        }
        sc.close();
    }
}