import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Two_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.addAll(Arrays.asList(1,2,3));
        System.out.println("Set A: " + hs1);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.addAll(Arrays.asList(2,3,4));
        System.out.println("Set B: " + hs2);

        hs1.retainAll(hs2);
        System.out.println("Intersection of Two Sets is: " + hs1);
    }
}
