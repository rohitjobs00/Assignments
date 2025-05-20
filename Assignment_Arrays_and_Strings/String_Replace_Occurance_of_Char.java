import java.util.Scanner;

public class String_Replace_Occurance_of_Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0);

        System.out.print("Enter the new character: ");
        char newChar = scanner.next().charAt(0);

        String replacedStr = str.replace(oldChar, newChar);

        System.out.println("Updated string: " + replacedStr);
    }
}
