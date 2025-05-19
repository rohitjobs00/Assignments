public class Merge_two_Arrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        System.out.print("Array 1 is: ");
        for(int ele : arr1){
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.print("Array 2 is: ");
        for(int ele : arr2){
            System.out.print(ele + " ");
        }
        System.out.println();

        int [] mergedArray = new int[arr1.length + arr2.length];
        for(int i=0; i< arr1.length; i++){
            mergedArray[i] = arr1[i];
        }

        for(int i=0; i<arr2.length; i++){
            mergedArray[arr1.length+i] = arr2[i];
        }

        System.out.print("Merged array is: ");
        for(int ele : mergedArray){
            System.out.print(ele + " ");
        }
    }
}
