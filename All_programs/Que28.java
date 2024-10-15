class num1 extends Thread
{
    public void run(){
        int i;
        for(i=0;i<50;i++)
        {
            System.out.println(i);
        }    
    }
    

}
class num2 extends Thread
{
    public void run()
    {
        int j;
        for(j=50;j>=0;j--)
        {
            System.out.println(j);
        }
    }
}
public class Que28 {
    public static void main(String[] args) {
        num1 n1=new num1();
        num2 n2=new num2();
        n1.start();
        n2.start();
        
    }

}
