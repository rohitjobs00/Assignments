public class Sum_of_Elements_in_Array {
    public static void main(String[] args) {
        int [] arr = {10,20,40,55,71,64};
        int sum = 0;
        for(int ele : arr){
            sum += ele;
        }
        System.out.println("Sum of all the elemnet sin array is: " + sum);
    }
}
