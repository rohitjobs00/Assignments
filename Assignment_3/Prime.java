public class Prime {
    public static void main(String[] args) {
        int num = 8;
        int count = 0;
        for(int i=1; i<=7; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num + " is a Prime Number.");
        }
        else{
            System.out.println(num + " is not a Prime Number.");
        }
    }
}
