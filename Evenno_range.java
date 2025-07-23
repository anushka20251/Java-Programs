import java.util.Scanner;
public class Evenno_range {
    public static void main(String[] args){
        for(int i=1;i<=1000;i++){
       boolean even=iseven(i);
       if (even){
         System.out.println(i);
       }
       }
}
public static boolean iseven(int number){
       for(int i=1;i<=1000;i++){
        if(number%2==0)
        {
           return true;
            
        }
        
       }
       return false;
    }
}
