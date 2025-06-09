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
