public class String_Pallindrome {
    public static void main(String[] args) {
        String name = "Nitin";
        String newName = name.toLowerCase();
        String rev = "";
        System.out.println("Original String is: " + newName);
        for(int i=newName.length()-1; i>=0; i--){
            rev = rev + newName.charAt(i);
        }
        System.out.println("Reverse String is: " + rev);
        if(newName.equals(rev)){
            System.out.println("Hence, its Pallindrome");
        }
        else{
            System.out.println("Hence, not a Pallindrome");
        }

    }
}
