import java.util.HashSet;
import java.util.Set;

public class Find_First_Repeating_Element_Using_Set {
    public static void main(String[] args) {
        int [] arr = {10,5,3,4,3,5,6};
//        int [] arr = {10,5,4,3,6};

        Set<Integer> hs1 = new HashSet<>();

        for(int ele : arr){
            if(hs1.contains(ele)){
                System.out.println("First Repeated Element is: " + ele);
                return;
            }
            else{
                hs1.add(ele);
            }
        }
        System.out.println("No repeating elements found.");
    }
}
