import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose one of our products, enter its code and the desired quantity!");
        System.out.println("[ 1 ] [  HOT DOG  ] [$ 4.00]");
        System.out.println("[ 2 ] [  X-SALAD  ] [$ 4.50]");
        System.out.println("[ 3 ] [  X-BACON  ] [$ 5.00]");
        System.out.println("[ 4 ] [PLAIN TOAST] [$ 2.00]");
        System.out.println("[ 5 ] [    SODA   ] [$ 1.50]");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int quantity = sc.nextInt();
        sc.close();

        double total;

        switch (choice) {
            case 1:
                total = 4.00 * quantity;
                System.out.printf("TOTAL: $ %.2f%n", total);
                break;
            case 2:
                total = 4.50 * quantity;
                System.out.printf("TOTAL: $ %.2f%n", total);
                break;
            case 3:
                total = 5.00 * quantity;
                System.out.printf("TOTAL: $ %.2f%n", total);
                break;
            case 4:
                total = 2.00 * quantity;
                System.out.printf("TOTAL: $ %.2f%n", total);
                break;
            case 5:
                total = 1.50 * quantity;
                System.out.printf("TOTAL: $ %.2f%n", total);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}