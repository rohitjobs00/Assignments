import java.util.Arrays;
import java.util.HashSet;

public class Union_of_Two_Sets {
    public static void main(String[] args) {
        HashSet<Integer> SetA = new HashSet<>();
        SetA.addAll(Arrays.asList(1,2));
        System.out.println("Set A is: " + SetA);

        HashSet<Integer> SetB = new HashSet<>();
        SetB.addAll(Arrays.asList(2,3));
        System.out.println("Set B is: " + SetB);

        HashSet<Integer> SetC = new HashSet<>();
        SetC.addAll(SetA);
        SetC.addAll(SetB);

        System.out.println("Union of two sets is: " + SetC);

//        If you still want to update SetA and check if any change occurred
//        boolean changed = SetA.addAll(SetB); // Returns true if SetA changed (new elements added)
//        System.out.println("Set A after Union: " + SetA);
//        System.out.println("Does Set A changed: " + changed);
    }
}
