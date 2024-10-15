import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
      
        Double area,per, l,w;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and width");
        l=sc.nextDouble();
        w=sc.nextDouble();
        area=l*w;
        System.out.println("Area is="+area);
        per=2*(l+w);
        System.out.println("Perimeter is "+per);      
    }
}
