class Mull
{
int a,b,c;
void accept()
{
a=10;
b=20;
}
void multiply()
{
c=a*b;
}
void display()
{
System.out.println("value of a="+a);
System.out.println("value of b="+b);
System.out.println("Mull="+c);
}
}
class MullDemo
{
public static void main(String [] args)
{
System.out.println("I am from main body");
Mull mo = new Mull();
mo.accept();
mo.multiply();
mo.display();
System.out.println("I am from main body");
}
}