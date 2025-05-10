import java.util.Scanner;

public class Area_Circum_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle in cm: ");
        int radius = sc.nextInt();

        double area = 3.14 * radius * radius;
        double circum = 2 * 3.14 * radius;

        System.out.println("Area of the Circle with radius " + radius + " cm is : " + area + " sqcm");
        System.out.println("Circumference of the Circle with radius " + radius + " cm is : " + circum + " cm");

    }
}
