import java.util.*;
class Add{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	
	public void display()
	{
		c=a+b;
		System.out.println("addition of two number is:" +c);
	}
}

public class AddDemo
{
	public static void main(String args[])
	{
		Add obj=new Add();
		obj.accept();
		obj.display();
	}
}
