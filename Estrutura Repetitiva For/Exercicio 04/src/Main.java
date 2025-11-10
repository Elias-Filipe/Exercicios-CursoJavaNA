import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Enter the number of operations you want.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double a, b;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the first number");
            a = sc.nextDouble();
            System.out.println("Enter the second number");
            b = sc.nextDouble();

            if (b != 0) {
                System.out.println(a / b);
            } else System.out.println("IMPOSSIBLE DIVISION");
        }
        sc.close();
    }
}