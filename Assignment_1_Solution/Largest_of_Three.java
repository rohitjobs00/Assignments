import java.util.Scanner;

public class Largest_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter value of num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter value of num3: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greater.");
        }
        else if(num2> num1 && num2 > num3){
            System.out.println(num2 + " is greater.");
        }
        else{
            System.out.println(num3 + " is greater.");
        }

    }
}
