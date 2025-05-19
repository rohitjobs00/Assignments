public class Reverse_an_Array {
    public static void main(String[] args) {
        int [] arr = {6,15,18,9,20};
        int l = arr.length;
        int mid = l/2;
        int temp;

        for(int i=0; i<mid; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        System.out.println("Reverse of the array is: ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
