import java.util.*;
public class Que18 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vector v = new Vector<>();
        v.addElement(5);
        v.addElement(6);
        v.addElement("sahil");
        v.addElement("pranav");
        v.addElement(5.5);
        v.addElement(6.6);
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.elementAt(i));
        }
        System.out.println("enter the index to remove the element :  ");
        int index = sc.nextInt();
        v.removeElementAt(index);
        System.out.println("element removed are : " + v.elementAt(index));
       
    }
}



