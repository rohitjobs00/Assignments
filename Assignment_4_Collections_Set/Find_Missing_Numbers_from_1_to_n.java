import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_Missing_Numbers_from_1_to_n {
    public static void main(String[] args) {
        Set<Integer> hs1 = new HashSet<>();
        int n=6;
        for(int i=1; i<=n; i++){
            hs1.add(i);
        }

        int [] arr = {1,2,4,6};
        System.out.print("Array is:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        for(int ele:arr){
            if(hs1.contains(ele)){
                hs1.remove(ele);
            }
        }
        System.out.println("Missing ELements are: " + hs1);
    }
}
