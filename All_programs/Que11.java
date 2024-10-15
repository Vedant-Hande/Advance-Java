import java.util.Scanner;

class student {
    int id,mark;
    String name;
    Scanner sc=new Scanner(System.in);
    void Accept()
    {
        System.out.println("Enter the id,name,marks=");
        id=sc.nextInt();
        name=sc.next();
        mark=sc.nextInt();
    }
    void Display()
    {
        System.out.println("ID="+id);
        System.out.println("NAME="+name);
        System.out.println("MARKS="+mark);
    }
}
class Que11
{
    public static void main(String[] args) {
        student s1=new student();
        s1.Accept();
        s1.Display();
     
    }
    
}
