public class Smallest_ele_in_Array {
    public static void main(String[] args) {
        int [] arr = {78,12,45,100,6,98};
        int min = arr[0];
        System.out.println("Our Array is:");
        for(int ele : arr){
            System.out.print(ele + " ");
            }
        System.out.println();
        for(int ele : arr){
            if(ele < min){
                min = ele;
            }
        }
        System.out.println("Minimum element in an array is: " + min);
    }
}
