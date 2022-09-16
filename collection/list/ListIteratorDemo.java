import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo
{
  public static void main(String[] args)
   {
      List obj=new ArrayList();
      
      obj.add(10);
      obj.add("kishor");
      obj.add("rahul");

      ListIterator li=obj.listIterator();

      
      /*while(li.hasNext())
      {
          System.out.println(li.next());
      }
      */
      li.next();
      li.next();
      li.next();

      System.out.println("---------------------------");
      while(li.hasPrevious())
      {
          System.out.println(li.previous());
      }
      obj.remove("kishor");

      System.out.println(obj);

     obj.add(100);

     System.out.println(obj);

    }
}