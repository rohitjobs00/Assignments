public class Reverse_of_1234 {
    public static void main(String[] args) {
        int num = 1234;
        int temp = num;
        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reverse of the number is: " + reverse);
    }
}
