import java.util.Scanner;

public class Perfectno {
    public static void main(String[] args){
       
         isperfect();

}
 public static boolean isperfect(){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     
    int number=sc.nextInt();
    int sum=0;
    for(int i=1;i<number;i++)
    {
        if(number%i==0)
    {
        System.out.println(i);
        sum=sum+i;
    }
    }
    if(sum==number){
        System.out.println("perfect number");
        return true;
    }
    else{
        System.out.println(" not perfect number");
        return false;
    }
    
 }
}

