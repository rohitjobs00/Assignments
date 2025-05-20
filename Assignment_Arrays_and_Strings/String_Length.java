import java.util.Scanner;

public class String_Length {
    public static void main(String[] args) {
        /*
        String name = "Study as much as you can.";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String name = sc.nextLine();
        int count = 0;
        for(char c : name.toCharArray()){
            count++;
        }
        System.out.println("Length of the String is: " + count);
         */

        /*
        String name = "Alphabetical order";
        int count = 0;
        for(char c : name.toCharArray()){
            if(c == ' '){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println("Length of the String is (Excluding Spaces): " + count);
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String name = sc.nextLine();
        int length = name.length();
        int lengthExcSpaces = name.replace(" ","").length();
        System.out.println("Length of the string is: " + length);
        System.out.println("Length of the string is (Excluding Spaces): " + lengthExcSpaces);
    }
}
