import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int start, end;

        Scanner sc = new Scanner(System.in);

        System.out.println("What time did the game start?");
        start = sc.nextInt();

        System.out.println("What time did the game end?");
        end = sc.nextInt();

        sc.close();

        if (end > start) {
            int duration = end - start;
            System.out.println("DURATION = " + duration);
        }else {
            int  duration = 24 + (end - start);
            System.out.println("DURATION = " + duration);
        }
    }
}