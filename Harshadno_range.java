public class Harshadno_range {
    public static void main(String[] args){
        for(int i=10;i<1000;i++){
            boolean harsad=isharshad(i);
            if(harsad){
                System.out.println(i);
            }
        }
 }
    public static boolean isharshad(int number){
        int sum=0;
        int num=number;
        for(int i=10;i<1000;i++){
            int digit =number%10;
            sum=sum+digit;
            number=number/10;

        }
        if(num%sum==0){
            return true;
        }
        return false;
    }
}
