// wap to sort element from array using Bubble sort

class BubbleSortFromArrya
{
    public static void main(String[] args)
     {
         int[] a={36,29,12,5,19};

         int temp;
          for(int i=0;i<a.length;i++)
         {
             for(int j=0;j<a.length-1-i;j++)
             {
                 if(a[j]>a[j+1])
                 {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                 }
             }
         }
          for(int i=0;i<a.length;i++)
          {
            System.out.print(a[i]+" ");

          }        
    }
}