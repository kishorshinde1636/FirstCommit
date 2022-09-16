// wap to find maximum and minumim number from array

class FindMaxMinFromArray
{
    public static void main(String[] args)
   {
        int[] a={10,23,4,54,569,76,54};
        int max=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i] > max)
            {
                max=a[i];
            }
        }
        System.out.println("maximun number is :"+max);


    }
}