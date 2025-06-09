import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Two_Sorted_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5,7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,4,6,8));

        ArrayList<Integer> mergedList = new ArrayList<>();
        int i=0, j=0;

        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                mergedList.add(list1.get(i));
                i++;
            }
            else{
                mergedList.add(list2.get(j));
                j++;
            }
        }

        //Add remaining elements from list1
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Add remaining elements from list2
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }
        System.out.println(mergedList);
    }
}
