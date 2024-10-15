import java.io.*;


public class Que33 {
    public static void main(String[] args) {
       
        String fileName = "G:\\IF4I\\JPR\\All_program[1]\\output.txt";
        
        byte[] ch = {65, 66, 67, 68, 69}; 
        
        try {
           
            FileOutputStream fos = new FileOutputStream(fileName);
            
            fos.write(ch);
            
           
            fos.close();
            
            System.out.println("Bytes written to the file successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
