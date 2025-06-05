import java.util.HashMap;
import java.util.Map;

public class Unique_Elements_That_Appear_Only_Once {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,4};

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele :  arr){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        System.out.println(hm);
        System.out.println("Unique Elements are: ");
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
