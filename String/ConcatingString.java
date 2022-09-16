public class ConcatingString
{
    public static void main(String[] args)
    {
    
       
        String s2="KISHORa";
        int s3=0;

       for(int i=s2.length()-1;i>=0;i--)
       {
         if(s2.toLowerCase().charAt(i)=='a' || s2.toLowerCase().charAt(i)=='e' || s2.toLowerCase().charAt(i)=='i' || s2.toLowerCase().charAt(i)=='o' ||s2.toLowerCase().charAt(i)=='u' ) 
         {
             s3=s3+1;
         }
           
       }

       System.out.println(s3);
       

    }
}