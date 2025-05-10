import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temp = sc.nextDouble();

        double Celsius = (temp-32) / 1.8;

        System.out.println(temp + " Fahrenheit to Celsius is : " + Celsius);
    }
}
