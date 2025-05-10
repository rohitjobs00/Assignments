import java.util.Scanner;

public class Age_Increment {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
//        age++;
        System.out.printf("Incremented age is: %d.",++age);
    }
}
