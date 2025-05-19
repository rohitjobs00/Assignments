public class Copy_1_array_to_other_array {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.print("Copied array is: ");
        for(int ele : arr2){
            System.out.print(ele + " ");
        }
    }
}
