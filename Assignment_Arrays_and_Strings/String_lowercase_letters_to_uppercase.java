public class String_lowercase_letters_to_uppercase {
    public static void main(String[] args) {
        String name = "Rohit";
        String upperCaseString = "";
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch>'a' && ch<'z'){
                upperCaseString = upperCaseString + (char)(ch - 32);
            }
            else{
                upperCaseString = upperCaseString + ch;
            }
        }
        System.out.println("Upper Case String is: " + upperCaseString);

        /*Lowercase characters 'a' to 'z' have ASCII values from 97 to 122.

        Subtracting 32 from a lowercase letter gives its uppercase equivalent in ASCII.

        e.g., 'a' (97) → 'A' (65)

         */
    }
}
