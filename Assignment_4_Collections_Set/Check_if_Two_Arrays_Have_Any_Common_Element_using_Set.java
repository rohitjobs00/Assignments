import java.util.HashSet;
import java.util.Set;

public class Check_if_Two_Arrays_Have_Any_Common_Element_using_Set {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,2};

        Set<Integer> hs1 = new HashSet<>();
        for(int ele : arr1){
            hs1.add(ele);
        }

        boolean foundcommon = false;

        for(int ele : arr2){
            if(hs1.contains(ele)){
                System.out.println(ele + " is Common Element.");
                foundcommon = true;
            }
        }
        if(!foundcommon){
            System.out.println("Nothing found in common.");
        }

    }
}
