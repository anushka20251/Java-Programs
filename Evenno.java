import java.util.Scanner;
public class Evenno {
    public static void main(String[] args){
         iseven();
    }
    
    public static int iseven(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
        
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println(number+"is Even number");
            
        }
        

        else{
            System.out.println(number+" is not Even number");
        }
        return number;
       }
}

