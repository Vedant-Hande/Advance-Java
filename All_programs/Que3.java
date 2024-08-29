import java.util.*;
import java.io.*;
public class Que3 {
    
public static void main(String args[]) throws IOException
{
  Scanner sc=new Scanner(System.in);
    System.out.println("Enter number: ");
    int num=sc.nextInt();
    int flag=0;
    for(int i=2;i<num;i++)
    {
        if(num%i==0)
        {
            System.out.println(num + " is not a prime number");
            flag=1;
            break;
        }
    }
            if(flag==0)
            {
             System.out.println(num + " is a prime number");
            }
}
}

