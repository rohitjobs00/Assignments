import java.util.Scanner;

public class Print_Any_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which table is to be printed: ");
        int num = sc.nextInt();
        for(int i =1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
         }
    }
}
