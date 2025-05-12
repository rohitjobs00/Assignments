import java.util.Scanner;

public class Armstrong_153 {
    public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the number to check for armstrong: ");
            int num = 153;
            int temp = num;
            int sum = 0;
            int cube = 0;
            while(num!=0){
                int digit = num%10;
                cube = digit * digit * digit;
                sum = sum + cube;
                num = num/10;
            }
            if(sum == temp){
                System.out.println(temp+" is an Armstrong Number.");
            }
            else{
                System.out.println(temp+" is not an Armstrong Number.");
            }
        }
}
