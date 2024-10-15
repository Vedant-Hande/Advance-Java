class n1 extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<50;i++)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
        }
    }
}
class n2 extends Thread
{
    public void run()
    {
        int j;
        for(j=0;j<50;j++)
        {
            if(j%2==0)
            {
                System.out.println(j);
            }
        }
    }
}
public class Que35 {
    public static void main(String[] args) {
        n1 obj1=new n1();
        n2 obj2=new n2();
        obj1.start();
        obj2.start();
    }
}
