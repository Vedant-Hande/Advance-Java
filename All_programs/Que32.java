
import java.io.*;

public class Que32 {
    public static void main(String[] args) {
        
        String inputFile = "G:\\IF4I\\JPR\\All_program[1]\\input.txt";
        String outputFile = "G:\\IF4I\\JPR\\All_program[1]\\output.txt";
        
        try {
          
            FileReader re = new FileReader(inputFile);
            
            
            FileWriter wr = new FileWriter(outputFile);
            
          
            int num;
            while ((num = re.read()) != -1) {
                wr.write(num);
            }
            
           
            re.close();
            wr.close();
            
            System.out.println("File copied successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
