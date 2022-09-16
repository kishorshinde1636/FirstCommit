// wap to retrive array element from 2D array using for loop

class ArrayElementRetrive2D
{
    public static void main(String[] args)
   {
        int[][] a={{12,34,22,42},{12,345,6,7,53,22,42}};

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}