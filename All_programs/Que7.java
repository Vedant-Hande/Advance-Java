import java.util.Scanner;
public class Que7 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();
        
        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();
        
        System.out.print("Enter time period : ");
        double time = sc.nextDouble();
        
        double sl = (p * r * time) / 100;
        
        
        System.out.println("Simple Interest: " + sl);
        
       
    }
}


