import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class First_Non_Repeating_Element {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(3,5,3,4,5,6));

        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int ele : arr){
            freq.put(ele, freq.getOrDefault(ele,0) + 1);
        }
        System.out.println(freq);

        for(int ele : arr){
            if(freq.get(ele) == 1){
                System.out.println("First non-repeating element: " + ele);
                return;
            }
        }
        System.out.println("No non-repeating element found.");
    }
}
