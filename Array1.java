import java.util.*;
public class Array1 {
    public static void main(String args[])
    {   
        int num[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five values");
        for(int i=0; i<5 ;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("you have entered");
        for ( int i=0; i<5; i++){
            System.out.println(num[i]);
        }
    }
}
