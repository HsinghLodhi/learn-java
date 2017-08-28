class Sum
{
  int a,b;
  float c;
void acceptednumber()
  {
  a=10;
  b=20;
  }  
void add()
  {
  c=a+b;
  }
void sub()
  {
  c=a-b;
  }
void multi()
  {
   c=a*b;
  }
void divi()
  {
  c=a/b;
  }
void display()
  {
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("Sum="+c);
System.out.println("sub="+c);
System.out.println("multi="+c);
System.out.println("divi="+c);
  }
public static void main(String... args)
{
Sum s=new Sum();
s.display();
}
}