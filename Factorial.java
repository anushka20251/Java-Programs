import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        isfactorial();
    }
    public static int isfactorial(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     
    int number=sc.nextInt();
    int multiply=1;
    for(int i=number;i>=1;i--){
       
        multiply=multiply*i;

    }
    System.out.println("Factorial of " +number+ " is "+multiply);
    return 1;
    }
}
