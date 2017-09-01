import java.util.*;
class LinkedList1
{
public static void main(String... args)
{
LinkedList l = new LinkedList();
l.add("HIMMAT");
l.add(30);
l.add(null);
l.add("HIMMAT");
System.out.println(l);
l.set(0,"software");
l.add(0,"venky");
l.removeLast();
l.addFirst("ccc");
System.out.println(l);
}
}