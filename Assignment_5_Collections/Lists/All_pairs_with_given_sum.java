import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class All_pairs_with_given_sum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,4,3,5,7));
        int target = 7;

        HashSet<Integer> seen = new HashSet<>();

        System.out.println("Pairs with sum " + target + ":");

        for (int num : list) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.add(num); // add after check to avoid pairing the same element with itself
        }
    }
}
