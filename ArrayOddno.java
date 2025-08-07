public class ArrayOddno {
    public static void main(String[] args){
        int[] arr=new int[7];
        arr[0]=21;
        arr[1]=70;
        arr[2]=113;
        arr[3]=46;
        arr[4]=50;
        arr[5]=10;
        arr[6]=12;
       for(int i=0;i<5;i++)
       {
        if(arr[i]%2!=0)
        {
            System.out.println(arr[i]);
       
        }
       }
  }
}


