public class Count_Even_Odd_Numbers {
    public static void main(String[] args) {
        int arr[] = {2,8,78,45,65,96,35,47,44};
        int counteven = 0, countodd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                counteven++;
            }
            else{
                countodd++;
            }
        }
        System.out.println("Count of Even number elements are: " + counteven);
        System.out.println("Count of Odd number elements are: " + countodd);
    }
}
