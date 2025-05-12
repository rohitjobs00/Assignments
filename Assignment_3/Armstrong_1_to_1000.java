import java.util.Scanner;

public class Armstrong_1_to_1000 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int num = i;
            int temp = num;
            int sum = 0;
            int power = 0;

            while(temp!=0){
                temp = temp / 10;
                power++;
            }
            temp = num;
            while (num != 0) {
                int d = num % 10;
                sum += Math.pow(d,power);
                num = num / 10;
            }
            if (sum == temp) {
                System.out.println(temp + " is an Armstrong Number.");
            }
        }
    }
}
