import java.util.Scanner;

public class Que1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              
        System.out.println("Enter three numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        
       
        double avg= (num1 + num2 + num3) / 3;
        
      
        System.out.println("The average is="+avg);
               
    }
}


