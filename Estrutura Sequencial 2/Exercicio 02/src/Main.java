import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;

        System.out.println("Enter a number to check if it is odd or even.");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}