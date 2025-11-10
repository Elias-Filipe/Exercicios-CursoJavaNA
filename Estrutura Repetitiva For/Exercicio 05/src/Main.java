import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number for which we want to calculate the factorial.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;

        if (n != 0) {
            for (int i = 0; i < n; i++) {
                factorial = factorial * (n - i);
            }
        } else factorial = 1;

        sc.close();

        System.out.println("FACTORIAL: " + factorial);
    }
}