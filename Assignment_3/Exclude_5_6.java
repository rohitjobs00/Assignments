public class Exclude_5_6 {
    public static void main(String[] args) {
        int num = 1;
        while(num<=10){
            if(num == 5 || num == 6){
                num++;
                continue;
            }else{
                System.out.print(num + " ");
                num++;
            }
        }
    }
}
