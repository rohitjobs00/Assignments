/*
9. Count Occurrences of Each Element in an ArrayList.
Input: ["apple", "banana", "apple", "orange", "banana", "apple"]
Expected Output: apple → 3	banana → 2   orange → 1
Hint: Use HashMap to store frequencies.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Occurence_of_element_in_ArrayList {
    public static void main(String[] args){

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple"));

        HashMap<String, Integer> result = new HashMap<>();

        // Count Occurences
        for(String fruit : list1){
            result.put(fruit, result.getOrDefault(fruit, 0) + 1);
        }
        System.out.println(result);

        // Print frequencies
        for(Map.Entry<String, Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
