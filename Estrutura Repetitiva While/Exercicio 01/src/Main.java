import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int password = 0;

        Scanner sc = new Scanner(System.in);

        while (password != 2002) {
            System.out.println("wrong password");
            password = sc.nextInt();
        }
        System.out.println("correct password");
        sc.close();
    }
}