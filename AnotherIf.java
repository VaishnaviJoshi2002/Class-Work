import java.util.*;
class AnotherIf
{
	public static void main(String args[])
	{
	int a,b,c;
	Scanner sc=sc.Scanner(System.in);
	System.out.println("Enter three numbers:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("a is greater " +a);
		}
		else
		{
			System.out.println("c is greater " +c);
		}
	else if(b>c)
	{	
		Sytem.out.println(" b is greater " +b);
	}
	else
	{
		System.out.println("c is greater " +c);
	}
}
}
}