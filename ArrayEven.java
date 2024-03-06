import java.util.*;
public class ArrayEven {
    public static void main(String args[])
    {
        int a[]=new int[6];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter six numbers:");
        for(int i=0; i<=5; i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                sum+=a[i];
            }
        }
        System.out.println("sum of even number is:"+sum);
    }
}
