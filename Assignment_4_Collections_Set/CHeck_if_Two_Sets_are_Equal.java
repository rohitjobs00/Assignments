import java.util.Arrays;
import java.util.HashSet;

public class CHeck_if_Two_Sets_are_Equal {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.addAll(Arrays.asList(1,2,3));
        System.out.println("Set 1: " + hs1);

        HashSet<Integer> hs2 = new HashSet<>();
//        hs2.addAll(Arrays.asList(3,2,1));
        hs2.add(3);
        hs2.add(2);
        hs2.add(1);
        System.out.println("Set 2: " + hs2);

        System.out.println("Are the two sets equal: " + hs1.equals(hs2));
    }
}
