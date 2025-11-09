import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Enter 2 values so we know which quadrant it is in.");

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x > 0) {
            if (y > 0) {
                System.out.println("Q1");
            } else if (y < 0) {
                System.out.println("Q4");
            } else System.out.println("is on X-axis, between Q1 and Q4");
        } else if (x > 0) {
            if (y > 0) {
                System.out.println("Q2");
            } else if (y < 0) {
                System.out.println("Q3");
            } else System.out.println("is on x-axis, between Q2 and Q3");
        } else if (x == 0) {
            if (y > 0) {
                System.out.println("is on y-axis, between Q1 and Q2");
            } else if (y < 0) {
                System.out.println("is on y-axis, between Q3 and Q4");
            } else System.out.println("is on origin (0,0)");
        }
    }
}