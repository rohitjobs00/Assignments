public class First_Non_Repeated {
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Find the first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First non-repeated character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeated character found.");
    }
}
