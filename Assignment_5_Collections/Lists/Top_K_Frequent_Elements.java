import java.util.*;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(4,4,1,2,2,2,3,3));
        int k = 2;

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int ele : arrList){
            freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
        }
        System.out.println(freqMap);

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        System.out.println(entryList);

        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        System.out.println(entryList);

        System.out.println("Top " + k + " frequent elements: ");
        for(int i=0; i<k && i<entryList.size(); i++){
            Map.Entry<Integer, Integer> entry = entryList.get(i);
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
        }
    }
}
