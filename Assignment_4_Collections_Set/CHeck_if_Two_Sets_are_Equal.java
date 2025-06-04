import java.util.Arrays;
import java.util.HashSet;

public class CHeck_if_Two_Sets_are_Equal {
    public static void main(String[] args) {
        HashSet<Integer> SetA = new HashSet<>();
        SetA.addAll(Arrays.asList(1,2,3));
        System.out.println("Set A: " + SetA);

        HashSet<Integer> SetB = new HashSet<>();
//        SetB.addAll(Arrays.asList(3,2,1));
        SetB.add(3);
        SetB.add(2);
        SetB.add(1);
        System.out.println("Set B: " + SetB);

        System.out.println("Are the two sets equal: " + SetA.equals(SetB));
    }
}
