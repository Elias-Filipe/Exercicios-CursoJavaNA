import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int cod1, cod2, num1, num2;
        double price1, price2, total;

        Scanner sc = new Scanner(System.in);

        System.out.println("insira na sequencia: [o código de uma peça 1], [o número de peças 1], [o valor unitário de cada peça 1]");
        System.out.println("Enter the following sequence: [the code of one part 1], [the number of parts 1], [the unit price of each part 1]");
        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        price1 = sc.nextDouble();


        System.out.println("insira na sequencia: [o código de uma peça 2], [o número de peças 2], [o valor unitário de cada peça 2]");
        System.out.println("Enter the following sequence: [the code of one part 2], [the number of parts 2], [the unit price of each part 2]");
        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        price2 = sc.nextDouble();

        sc.close();

        total = (num1 * price1) + (num2 * price2);

        System.out.printf("VALOR A PAGAR: %.2f%n", total);
        System.out.printf("AMOUNT TO PAY %.2f%n", total);

    }
}