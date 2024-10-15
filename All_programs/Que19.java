public class Que19 {
    int id,roll;
    String name;
    Que19()
    {
       name="Pranav ambre"; 
    }
    Que19(int i,int r)
    {
        id=i;
        roll=r;
    }
    void output()
    {
        System.out.println("Name="+name);
    }
    void out()
    {
        System.out.println("ID="+id);
        System.out.println("ROLL="+roll);
    }
    public static void main(String[] args) {
        Que19 obj=new Que19();
        Que19 obj1=new Que19(123, 6);
        obj.output();
        obj1.out();
    }

}
