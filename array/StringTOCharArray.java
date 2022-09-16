class StringTOCharArray
{
    public static void main(String[] args)
    {
        String str1="Tata";

        char[] char1=str1.toCharArray();

        for(char c:char1)
        {
            System.out.println(c);
        }
    }
}