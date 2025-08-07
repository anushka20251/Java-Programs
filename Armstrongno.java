import java.util.Scanner;

public class Armstrongno {
    public static  Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter size");
         int size=sc.nextInt();
         

         int[] arr=new int [size];
           for(int i=0;i<arr.length;i++)
           {
             arr[i]=sc.nextInt();
             
           }

           for(int i=0;i<arr.length;i++)
           {
             
             if(isarmstrong(arr[i]))
           {
            System.out.print(arr[i]+" ");
           }
           }
           
       
   }
    public static boolean isarmstrong(int num)
    {
         int sum=0;
         
         int number=num;

    
         for(int i=0;i<num;i++)
         {
            int digit=number%10;
            
            sum+=digit*digit*digit;
            number=number/10;
          }
          if(sum==num)
          {
            return true;
          }
          return false;
    }
          
    
         
            
}

        
         

    

