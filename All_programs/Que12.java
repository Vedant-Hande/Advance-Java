import java.util.Scanner;

class employee 
{
    Scanner sc=new Scanner(System.in);
    String emp_name;
    int basic;
    float da,hra,gross;
    void Accept()
    {
        System.out.println("Enter the name=");
        emp_name=sc.next();
        System.out.println("Enter basic salary=");
        basic=sc.nextInt();
        
    }
    void Display()
    {
        System.out.println("Name="+emp_name);
        da=(75*basic)/100;
        hra=(30*basic)/100;
        gross=basic+da+hra;
        System.out.println("Gross salary is="+gross);

    }
}
class Que12
{
    public static void main(String[] args) {
        employee e1=new employee();
        e1.Accept();
        e1.Display();
    }
}