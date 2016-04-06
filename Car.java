
public class Car {
    
	int Fuel_Efficiency;
	double Fuel;
	int Tank_Capacity=20;

        
        
        
	public void drive(int distance){
            
            if(distance < 0){
                
                System.out.println("distance cannot be negative");
            }    
            else {
                
                if((distance / Fuel_Efficiency) > Fuel){
                    
                    System.out.println("Out of range");
                }
                else {
                    
                     Fuel = Fuel - (distance / Fuel_Efficiency);
                }
            }
            
	}

	public void addFuel(double gas){
        
            if(gas < 0) {
                
                System.out.println("you cannot steal gas");
            }   
            
            if(Fuel + gas > Tank_Capacity) {
                
                Fuel = 20;
                System.out.println("Tank is full");
            }
            else
            {
                Fuel = Fuel + gas;
            }
        }
                
	public Car(int fe){

		Fuel_Efficiency = fe;
		Fuel = 0;
	}
        
        public double getGasInTank(){
        
            return Fuel;
        }
}
