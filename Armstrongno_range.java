
import java.util.Scanner;

public class Armstrongno_range {
    public static void main(String[] args){
         for(int i=1;i<1000;i++){
         boolean armstrongno=isarmstrong(i);
         if(armstrongno){
            System.out.println(i);
         }
     }

}
 public static boolean  isarmstrong(int number){
   
    
     int num=number;
     int sum=0;
      for(int i=1;i<1000;i++){
        int digit=number%10;
        int cube=digit*digit*digit;
        sum=sum+cube;
        number=number/10;
    }

     
      if(num==sum){
        return true;

      }
     return false;
  }
     
     }


