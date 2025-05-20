public class String_Compare_Two_Strings {
    public static void main(String[] args) {
        String str1 = "Rohit";
        String str2 = "rohit";

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Two strings are equal.");
        }
        else{
            System.out.println("Two strings are not equal.");
        }
    }
}
