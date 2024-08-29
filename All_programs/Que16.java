public class Que16 {
         private String message;
          
        public Que16() {
            this.message = "Default constructor message";
        }
        
            public Que16(String message) {
            this.message = message;
        }
                
        protected void finalize() {
            System.out.println("Finalizing object with message: " + this.message);
        }
        
        public static void main(String[] args) {
            Que16 obj1 = new Que16();
            Que16 obj2 = new Que16("Custom message");
            
           
            System.out.println("Message from object 1: " + obj1.message);
            System.out.println("Message from object 2: " + obj2.message);
            
           
        }
    }
    

