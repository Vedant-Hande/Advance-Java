import java.util.Scanner;

interface r_area
{
    void Accept();
    void Display();
}
interface c_area
{
    void input();
    void output();
}
class Que25 implements r_area,c_area
{
    double r,l,w,result1,result2;
    Scanner sc=new Scanner(System.in);
    public void Accept()
    {
        System.out.println("Enter the length and width=");
        l=sc.nextDouble();
        w=sc.nextDouble();
    }
    public void Display()
    {
        result1=l*w;
        System.out.println("Area of rectangle is ="+result1);

    }
    public void input()
    {
        System.out.println("Enter redius=");
        r=sc.nextInt();
    }
    public void output()
    {
        result2=3.14*r*r;
        System.out.println("Area of circle is="+result2);
    }
    public static void main(String[] args) {
        Que25 obj=new Que25();
        obj.Accept();
        obj.input();
        obj.Display();
        obj.output();
    }
}