#include<stdio.h>
#include<conio.h>
 int main()
{
	int n,i,count=0;
	printf("enter number value");
	scanf("%d",&n) ;
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==0)
	printf("prime number");
	else
	printf("not prime");
	getch();
}

