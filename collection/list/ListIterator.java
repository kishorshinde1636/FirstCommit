import java.util.ArrayList;

import java.util.ListIterator;

class ListIterator
{
    public static void main(String[] args)
   {
      List obj=new ArrayList();
      
      obj.add(10);
      obj.add("kishor");
      obj.add("rahul");

      //System.out.println(l1);

      ListIterator iteratar=obj.listIterator();
      while(iteratar.hashCode())
      {
          System.out.println(iteratar.next());
      }

    }
}