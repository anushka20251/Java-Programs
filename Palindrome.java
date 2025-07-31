import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        boolean palindrome=  ispalindrome();
        if(palindrome){
        System.out.println("is palindrome");
        }
        else{
                 System.out.println("is not  palindrome");
        }
    }
    public static boolean ispalindrome(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
    
     int num=sc.nextInt();
     int number=num;
     int reverse=0;
        while(number>0){
         int digit =number%10;
         reverse=reverse*10+digit;
         number=number/10;
        }
        
       
        return num==reverse;
        
    
    }

}
