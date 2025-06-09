import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Remove_string_with_length_less_than_three {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "ab", "abc", "java", "is", "fun", "ok", "yes"));
        System.out.println("Original String is: " + list1);

        // Using removeIf method
        list1.removeIf(str -> str.length()<3);
        System.out.println("String with length greater than 3 is: " + list1);

        // Using iterator
        Iterator<String> itr = list1.iterator();
        while(itr.hasNext()){
            if(itr.next().length()<3){
                itr.remove();
            }
        }
        System.out.println("String with length greater than 3 is: " + list1);

    }
}
