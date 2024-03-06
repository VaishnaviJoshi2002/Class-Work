import java.util.*;
public class ArrayMax 
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        int i,max;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter five numbers:");
        for(i=0; i<5; i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(i=0; i<5; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("maxmium number is:"+max);
    }
}
   


