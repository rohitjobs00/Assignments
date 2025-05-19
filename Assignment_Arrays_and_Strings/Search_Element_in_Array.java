public class Search_Element_in_Array {
    public static void main(String[] args) {
        int [] arr = {5,7,8,9,4};
        int num = 4;
        int index = 0;
        boolean isPresent = false;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == num){
                index = i;
                isPresent = true;
            }
        }
        if(isPresent){
            System.out.println(num + " is present in Array at index " + index);
        }
        else{
            System.out.println(num + " is not present in Array.");
        }
    }
}
