import java.util.Scanner;

class pass extends Exception
{
    pass(String msg)
    {
        super(msg);
    }
}
public class Que27 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        String pass1;
        System.out.println("Enter the password=");
        pass1=sc.next();
        try{
            if(pass1.equals("MSBTE"))
            {
                System.out.println("Password is correct");
            }
            else
            {
                throw new pass("no match");
            }
        }catch(pass e){
            System.out.println(e);
        }
    }
    
}
