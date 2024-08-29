   
class Vehicle {
   
    public void display() {
        System.out.println("This is a vehicle.");
    }
}


class Car extends Vehicle {
    
    @Override
    public void display() {
        System.out.println("This is a car.");
    }
}

public class Que20 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
                
        v.display(); 
        c.display();    
    }
}

