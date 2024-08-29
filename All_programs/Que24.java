
class demo
{
    public void output()
    {
        System.out.println("Demo class");
    }

    public void out1() {
    }
}
class Pranav1 extends demo{

    public void display() {
        System.out.println("I am a pranav ambre");
    }
}


class clg1 extends Pranav1 {
  
    public void out() {
        System.out.println("AVPOLY");
    }
}

public class Que24 {
    public static void main(String[] args) {
      
      clg1 c=new clg1();
        c.output();
        c.display(); 
        c.out();    
    }
}
