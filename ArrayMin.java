import java.util.*;
public class ArrayMin
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        int i,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five numbers");
        for(i=0; i<5; i++)
        {
            a[i]=sc.nextInt();
        }
        min=a[0];
        for(i=0; i<5;i++)
        {
            if(a[i]<min);
            {
                min=a[i];
            }
        }
        System.out.println("small element is:"+min);
    }

}