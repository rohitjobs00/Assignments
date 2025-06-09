/*
1. Remove Duplicates from an ArrayList (Without using Set or Streams).
Input: [10, 20, 10, 30, 20, 40]
Expected Output: [10, 20, 30, 40]
Hint: Use a nested loop or a new ArrayList with contains() check
*/
import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.addAll(Arrays.asList(1,2,2,3,4,5,4,6,7,8,8,5,10));

        ArrayList<Integer> result = new ArrayList<>();
        for(int ele : arrlist){
            if(!result.contains(ele)){
                result.add(ele);
            }
        }
        System.out.println("Original List: " + arrlist);
        System.out.println("List without duplicates: " + result);
    }
}
