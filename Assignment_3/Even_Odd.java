import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check even or odd: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is an Even Number.");
        }
        else{
            System.out.println(num + " is not an Odd number.");
        }
    }
}
