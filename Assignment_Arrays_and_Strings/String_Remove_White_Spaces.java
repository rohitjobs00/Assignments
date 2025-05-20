public class String_Remove_White_Spaces {
    public static void main(String[] args) {
        String str = "India is a great country.";
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                continue;
            }
            else{
                newStr = newStr + str.charAt(i);
            }
        }
        System.out.println("String after removing whitespaces is:");
        System.out.println(newStr);
    }
}
