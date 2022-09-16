import java.util.*;
class linklistDemo
{
    public static void main(String[] args)
    {
       // int[][] arr={{1,2,3,445,56,7},{1,23,45,6,4}};

       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int num[]=new int[size];
       for(int i=0;i<size;i++)
       {
               num[i]=sc.nextInt();
         }



        for(int i=0;i<size;i++)
        {
                System.out.print(num[i]);
          }
       
    }
  
}