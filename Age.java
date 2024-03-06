import java.util.*;
class Age
{
	public static void main(String args[])
	{
		int a , b ,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater then a and c");
		}
		else
		{
			System.out.println("c is greater then b and a");
		}
	}
}