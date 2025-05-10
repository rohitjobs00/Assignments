import java.util.Scanner;

public class NAme_Age {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.printf("Entered name is %s and age is %d.",name,age);
    }
}
