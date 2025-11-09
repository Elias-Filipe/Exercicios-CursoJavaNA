import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to check if they are multiples.");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("They are multiples.");
        }else {
            System.out.println("Are not multiples.");
        }

    }
}