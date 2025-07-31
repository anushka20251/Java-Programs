public class Palindromeno_range {
    public static void main(String[] args){
        for(int i=10;i<1000;i++){
           // boolean palindrome=ispalindrome(i);
           //if(palindrome)
            if(ispalindrome(i)){
                System.out.println(i);
            }
        }
    }

        public static boolean ispalindrome(int number){
            int reverse=0;
            int num=number;
            while(number>0){
                int digit=number%10;
                reverse=reverse*10+digit;
                number=number/10;
            }
            if(num==reverse){
                return true;
            }
            return false;
        }
    }


