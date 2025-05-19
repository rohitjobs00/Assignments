public class Largest_element_in_Array {
    public static void main(String[] args) {

        int [] arr = {10,45,20,18,99,12};
        int max = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element in an Array is: " + max);
    }
}
