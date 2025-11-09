import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        System.out.println("Which of our products would you like?");
        System.out.println("[ 1 ] [ALCOHOL]\n[ 2 ] [GASOLINE]\n[ 3 ] [DIESEL]\n[ 4 ] [End of service]");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        while (choice != 4) {
            if (choice == 1) {
                alcohol ++;
            }else if (choice == 2) {
                gasoline ++;
            }
            else if (choice == 3) {
                diesel ++;
            }
            choice = sc.nextInt();
        }
        sc.close();
        System.out.println("Alcohol: " + alcohol + "\nGasoline: " +  gasoline +  "\nDiesel: " +  diesel + "\nTHANK YOU!");
    }
}