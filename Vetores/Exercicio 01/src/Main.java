import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How many numbers do you want to check?");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            nums[i] = sc.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS");

        for (int i = 0; i < n; i++) {
            if(nums[i] < 0){
                System.out.println(nums[i]);
            }
        }

        sc.close();

    }
}