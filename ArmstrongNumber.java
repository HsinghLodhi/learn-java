import java.util.Scanner;
class ArmstrongNumber{
public static void main(String... d)
{
 int n,sum=0,c,d;
Scanner s =new Scanner(system.in);
System.out.println("Enter a any three digit Number");
n=s.nextInt();
c=n;
while(n!=0)
{
 d=n%10;
 sum=sum+d*d*d;
 n=n/10;
}
if(sum==c)
{System.out.println("Given number is Armstrong");
}
else
System.out.println("Given number is not a Armstrong");

}
}