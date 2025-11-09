import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int employee, hours;
        double hourValue, salary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número do seu funcionário!");
        System.out.println("Enter your employee number!");
        employee = sc.nextInt();

        System.out.println("Insira a quantidade de horas trabalhadas!");
        System.out.println("Enter the number of hours worked!");
        hours = sc.nextInt();

        System.out.println("Insira o valor que o funcionário recebe por hora!");
        System.out.println("Enter the hourly rate the employee receives!");
        hourValue = sc.nextDouble();

        salary = hourValue * hours;

        System.out.println("NUMBER = "+ employee);
        System.out.println("SALARY = "+ salary);


    }
}