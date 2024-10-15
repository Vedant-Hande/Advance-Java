import java.io.*;
public class Que34 {
    public static void main(String[] args) {
      
        String fileName = "G:\\IF4I\\JPR\\All_program[1]\\input.txt";
        
        try {

            FileReader reader = new FileReader(fileName);
            
            int count = 0;
            int value;
            
           
            while ((value = reader.read()) != -1) {
                count++;
            }
            
           
            reader.close();
            
            System.out.println("Number of characters in the file: " + count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
