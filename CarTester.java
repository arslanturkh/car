
public class CarTester {

    public static void main(String[] args) {
        
        Car car1 = new Car(50);
        
        car1.addFuel(100);
        
        
        System.out.println("Before driving you have " + car1.getGasInTank() + 
                " in the tank");
        
        car1.drive(100);
        
        System.out.println("After driving you have " + car1.getGasInTank() + 
                " in the tank");
        
        System.out.println("\n\n\nstart test all for car 2");
        testAll();
        
    }
    
    public static void testAll() {
        
        Car car2;
        car2 = new Car(50);
        
        car2.addFuel(10);
        System.out.println("Before driving you have " + car2.getGasInTank() + 
                " in the tank");
        
        car2.drive(100);
        
        System.out.println("After driving you have " + car2.getGasInTank() + 
                " in the tank");
        
        car2.drive(100);
    }
   
    
}
