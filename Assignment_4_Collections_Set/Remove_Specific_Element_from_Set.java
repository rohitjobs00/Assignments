import java.util.HashSet;

public class Remove_Specific_Element_from_Set {
    public static void main(String[] args) {
        HashSet<Character> hs1 = new HashSet<Character>();
        hs1.add('a');
        hs1.add('b');
        hs1.add('c');
        System.out.println("Original Set is: " + hs1);

        hs1.remove('b');
        System.out.println("Set after removing 'b': " + hs1);
    }
}
