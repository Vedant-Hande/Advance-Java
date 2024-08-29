import java.util.Scanner;

public class Que10 {
  

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       float mark,total=500;
       double per;
       System.out.println("Enter mark's");
       mark=sc.nextFloat();
        per = (mark/total)*100;
    
        System.out.println("Percentage: " + per);
        int re;
        if (per >= 70) {
          re=1;
        } else if (per >= 60) {
            re=2;
        } else if (per >= 50) {
           re=3;
        } else if (per >= 40) {
          re=4;
        } else {
            re=5;
        }
                       
            switch (re) {
                case 1:
                       System.out.println("Result is Distinction");           
                   
                    break;
                case 2:
                     System.out.println("Result is first class");
                     break;
                case 3:
                System.out.println("Result is second class");                
                    break;
                    case 4:
                    System.out.println("Result is pass class");
                    break;
                    case 5:
                    System.out.println("Result is fail");
                    break;

                default:
                    System.out.println("Invalid input");
            }
            sc.close();
        } 
       
       
    }
    
     



