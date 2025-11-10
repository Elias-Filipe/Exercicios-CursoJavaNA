import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number and see all its divisors.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}