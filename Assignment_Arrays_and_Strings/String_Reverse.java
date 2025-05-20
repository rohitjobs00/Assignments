public class String_Reverse {
    public static void main(String[] args) {
        String name = "Rohit";
        String rev = "";
        System.out.println("Original String is: " + name);
        for(int i=name.length()-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse is: " + rev);
    }
}
