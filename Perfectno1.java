import java.util.Scanner;

public class Perfectno1{
    public static void main(String[] args){
       
       for(int i=1;i<=1000;i++){
        boolean perfect=isperfect(i);
        if(perfect){
        System.out.println(i);
     }
    }
}
 public static boolean isperfect(int number){
   
    int sum=0;
    for(int i=1;i<number;i++)
    {
     if(number%i==0)
    {
        
        sum=sum+i;
    }
}
return sum==number;

 }
}



