import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int num;

        System.out.println(":Insert a number!");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        if (num < 0){
            System.out.println("NEGATIVE");
        }else{
            System.out.println("POSITIVE");
        }
    }
}