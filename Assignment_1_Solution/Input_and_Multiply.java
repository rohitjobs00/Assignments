import java.util.Scanner;

public class Input_and_Multiply {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter value of num2: ");
        int num2 = sc.nextInt();

        int mul = num1 * num2;
        System.out.printf("The multiplication of %d and %d is %d.",num1,num2,mul);
    }
}
