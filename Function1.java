public class Function1
{
 public int sum(int a,int b)
 {
  int temp;
  temp=a+b;
  return(temp); 
 }
public static void main(String... args)
 {
  Function1 f=new Function1();
  int s=f.sum(3,4);
  System.out.println("sum is ="+s);
 }
} 