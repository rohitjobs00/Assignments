public class Pallindrome_from_1_to_100 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            int  num = i;
            int rev = 0;
            int temp = num;
            while(num!=0){
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }
            if (rev == temp) {
                System.out.println(temp);
            }
        }
    }
}
