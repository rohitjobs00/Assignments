public class Sort_Array_Ascending {
    public static void main(String[] args) {
        int [] arr = {5,4,23,78,1};
        int temp;
        System.out.print("Unsorted Array is: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array is: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
