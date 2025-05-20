public class String_count_vowels_consonents {
    public static void main(String[] args) {
        String str = "India is a great country.";
        String newStr = str.toLowerCase();
        int vowelCount = 0;
        int consonentCount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = newStr.charAt(i);

            if(Character.isLetter(ch)){
                if(newStr.charAt(i) == 'a' || newStr.charAt(i) == 'e' || newStr.charAt(i) == 'i' || newStr.charAt(i) == 'o' || newStr.charAt(i) == 'u'){
                    vowelCount++;
                } else{
                    consonentCount++;
                }
            }
        }
        System.out.println("Count of Vowels is: " + vowelCount);
        System.out.println("Count of Consonent is: " + consonentCount);
    }
}
