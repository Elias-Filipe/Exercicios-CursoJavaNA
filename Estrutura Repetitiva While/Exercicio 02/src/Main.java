import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y;

        System.out.println("Write X and Y for the coordinates.");

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if(x > 0 && y > 0){
                System.out.println("FIRST");
            }else if(x < 0 && y > 0){
                System.out.println("SECOND");
            }else if(x < 0 && y < 0){
                System.out.println("THIRD");
            }else if(x > 0 && y < 0){
                System.out.println("FOURTH");
            }
            System.out.println("Type it again!");

            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}