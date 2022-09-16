import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorListIterator
{
    public static void main(String[] args)
   {
      List l1=new ArrayList<>();
      
      l1.add(10);
      l1.add("kishor");
      l1.add("shinde");

      //System.out.println(l1);

      Iterator itr=l1.iterator();

      while(itr.hasNext())
      {
        System.out.println(itr.next()); 
      }

      
    }
}