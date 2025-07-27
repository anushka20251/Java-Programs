import java.util.Scanner;
public class HarshadNumer{
    public static void main(String[] args){
       boolean harshad= isharshad();
       System.out.println(harshad);

   }
    public static boolean isharshad()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int number=num;
        int sum=0;
        

        while(number>0){
            int digit =number%10;
            sum = sum + digit;
            number=number/10;
        }
        

        if(number%sum==0){
           
             return true;
        }
        else{
           
             return false;
        }
    }
}
