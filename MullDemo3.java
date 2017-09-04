class Mull
 {
  int a,b,c,d;
  void accept(int p , int q , int r)
   {
    a = p;
    b = q;
    c = r;
    }
void multiplay()
   {
     d = a*b*c;
   }
void display()
   {
    System.out.println("value of a="+a);
    System.out.println("value of b="+b);
    System.out.println("value of c="+c);
    System.out.println("multiplay="+d);
   }
}
class MullDemo3
   {
public static void main(String[] k)
   {
    if(k.length !=3)
   {
System.out.println("plz enter three value from cmd prompt");
    }
        else
         {
          int x1 = Integer.parseInt(k[0]);
          int x2 = Integer.parseInt(k[1]);
          int x3 = Integer.parseInt(k[2]);
          Mull mo = new Mull();  
          mo.accept(x1,x2,x3);
          mo.multiplay();
          mo.display();
         }
    }
}