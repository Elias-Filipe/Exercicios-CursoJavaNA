import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if (num < 1000 && num > 0) {
            for (int i = 0; i < num; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }else System.out.println("Invalid number.");
    }
}