import java.util.Scanner;

class Account
{
    Scanner sc=new Scanner(System.in);
    String acc_name,acc_type;
    float bal;
    void Accept()
    {
        System.out.println("Enter the name,type,bal=");
        acc_name=sc.next();
        acc_type=sc.next();
        bal=sc.nextInt();
        
    }
    void Display()
    {
        System.out.println("Account name="+acc_name);
        System.out.println("Account type="+acc_type);
        System.out.println("Balance="+bal);
    }

}
class Que14
{
    public static void main(String[] args) {
        Account[] a=new Account[5];
        for(int i=0;i<5;i++)
        {
            a[i]=new Account();
            a[i].Accept();
        }
        for(int i=0;i<5;i++)
        {
            
            a[i].Display();
        }


    }
}