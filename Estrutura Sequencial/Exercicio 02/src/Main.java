import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double pi = 3.14159;
        double radius;
        double area;

        System.out.println("Insira o valor do raio que irei calcular a área do seu circulo!");
        System.out.println("Enter the radius value and I will calculate the area of your circle!");

        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        sc.close();

        area = pi * (radius * radius);

        System.out.printf("A área do seu círculo é: %.4f%n", area);
        System.out.printf("The area of your circle is: %.4f%n", area);
    }
}