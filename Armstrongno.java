
import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args){
       
         isarmstrong();

}
 public static boolean  isarmstrong(){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
      int number=sc.nextInt();
     int sum=0;
     int num=number;

     while(num>0){
     int digit=num%10;
     
     sum+=digit*digit*digit;
     num=num/10;
    
 }
 if(sum==number){
     System.out.println(number+"is armstrong");
     return true;
 }
 else{
      System.out.println(number+"is not  armstrong");
      return false;
 }
     
     }
}

