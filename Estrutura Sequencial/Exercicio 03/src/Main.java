import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Insira sequencialmente quatro números!");
        System.out.println("Enter four numbers sequentially!");

        Scanner sc = new Scanner(System.in);

        int a,b,c,d, dif;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        dif = a * b - c * d;

        sc.close();

        System.out.println(dif);

    }
}