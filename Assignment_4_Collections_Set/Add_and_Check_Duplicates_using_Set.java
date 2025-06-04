import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Add_and_Check_Duplicates_using_Set {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addAll(Arrays.asList(1,2,2,3,4,4,5));
        System.out.println("Linked List Elements: " + ll);

        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(ll);
        System.out.println("Converting to Set: " + hs);
    }
}
