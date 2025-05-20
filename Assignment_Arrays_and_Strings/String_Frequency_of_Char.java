public class String_Frequency_of_Char {
    public static void main(String[] args) {
        String str = "India is great country.";
        String newStr = str.toLowerCase();
        char ch = 'i';
        int count = 0;
        for(int i=0; i<newStr.length(); i++){
            if(newStr.charAt(i) == ch){
                count++;
            }
        }
        System.out.printf("Count of Character %s is : %d.",ch,count);
    }
}
