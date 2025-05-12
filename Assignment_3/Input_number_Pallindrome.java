import java.util.Scanner;

public class Input_number_Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for Pallindrome.");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if(reverse == temp) {
            System.out.println(temp + " is Pallindrome.");
        }
        else {
            System.out.println(temp + " is not a Pallindrome.");
        }
    }
}
