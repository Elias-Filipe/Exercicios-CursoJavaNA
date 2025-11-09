import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Olá, insira seu primeiro número!");
        System.out.println("Hi, insert your first number!");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Insira seu segundo número!");
        System.out.println("Insert your second number!");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        sc.close();

        System.out.println("A soma dos seus números é: " + result);
        System.out.println("The sum of their numbers is: " + result);
    }
}