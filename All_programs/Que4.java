import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("The number is Even="+num);
        }
        else
        {
            System.out.println("The number is Odd="+num);
        }
    }
}
