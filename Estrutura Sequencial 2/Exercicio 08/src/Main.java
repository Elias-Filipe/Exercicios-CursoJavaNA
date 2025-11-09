import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Enter the salary amount.");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        sc.close();

        if (salary <= 2000) {
            System.out.println("tax exempt");
        }
        else if (salary <= 3000) {
            double tax = (salary - 2000) * 0.08;
            System.out.printf("tax: R$ %.2f%n", tax);
        }
        else if (salary <= 4500) {
            double tax = ((salary - 3000) * 0.18) + (1000 * 0.08);
            System.out.printf("tax: R$ %.2f%n", tax);
        }
        else if (salary > 4500) {
            double tax = ((salary - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
            System.out.printf("tax: R$ %.2f%n", tax);
        }
    }
}