import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        int rev,sum,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num=");
        num=sc.nextInt();
        sum=0;
        while (num>0) 
        {
            rev=num % 10;
            sum=sum*10+rev;
            num=num/10;
        }
        System.out.println("Reverse number is="+sum);
    }
}
