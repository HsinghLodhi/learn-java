import java.util.*;
class Vector1
{
public static void main(String... args)
{
Vector V = new Vector();
System.out.println(V.capacity());
 for(int i = 1; i<=11; i++)
 { 
  V.addElement(i);
 }
System.out.println(V.capacity());
V.addElement("A");
System.out.println(V.capacity());
System.out.println(V);
 }
}