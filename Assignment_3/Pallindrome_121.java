public class Pallindrome_121 {
    public static void main(String[] args) {
        int num = 121;
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
