import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number to see its number of rows, square, and cube.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i+ " ");
            System.out.print(i * i + " ");
            System.out.println(i * i * i);
        }
        sc.close();
    }
}