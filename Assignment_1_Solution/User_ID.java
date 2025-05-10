import java.util.Scanner;

public class User_ID {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = 15;
        System.out.print("Enter your ID: ");
        int id = sc.nextInt();
        if(id == num){
            System.out.println("ID no. " + num + " matched succesfully.");
            System.out.println("Entered person is Jake and his age is 30.");
        }
        else{
            System.out.println("ID didn't matched. Please enter correct ID.");
        }
    }
}
