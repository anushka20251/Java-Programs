import java.util.Scanner;
public class Spyno_range{
    public static void main(String[] args){
        for(int i=10;i<1000;i++){
       boolean spy= isspy(i);
       if(spy){
        System.out.println(i);
       }
    }
   }
    public static boolean isspy(int number)
    {
        int sum=0;
        int multiply=1;

       while(number>0){
            int digit=number%10;
            sum = sum + digit;
            multiply=multiply*digit;

            number=number/10;
        }
        if(sum==multiply){
           
             return true;
        }
       
           
       return false;
        }
    }
