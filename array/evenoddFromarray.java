// wap to find even odd from array

class evenoddFromarray
{
    public static void main(String[] args) 
    {
        int[] a={12,3,45,66,43,212};

        System.out.println("even number are ::");

        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }

        System.out.println("odd number are ::");

        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]);
            }
        }

        
    }
}