public class Que17 {
   
        public static void main(String[] args) {
           
            s1();
            s2();
        }
       
        public static void s1() {
            String str = "Hello, World!";
            
            int length = str.length();
            String upperCaseStr = str.toUpperCase();
            System.out.println("Uppercase string: " + upperCaseStr);
            String lowerCaseStr = str.toLowerCase();
            System.out.println("Lowercase string: " + lowerCaseStr);
     
            String substring = str.substring(7);
            System.out.println("Substring starting from index 7: " + substring);
            boolean containsSubstring = str.contains("World");
            System.out.println("Does the string contain 'World'?: " + containsSubstring);
        }
        
        public static void s2() {
            StringBuffer stringBuffer = new StringBuffer("Hello");
              
            stringBuffer.append(" World!");
            System.out.println("StringBuffer after appending: " + stringBuffer);
            stringBuffer.insert(5, ", Java");
            System.out.println("StringBuffer after insertion: " + stringBuffer);
            stringBuffer.reverse();
            System.out.println("Reversed StringBuffer: " + stringBuffer);
            stringBuffer.delete(5, 10);
            System.out.println("StringBuffer after deletion: " + stringBuffer);
        }
    }
    

