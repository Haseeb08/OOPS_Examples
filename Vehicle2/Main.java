package Vehicle2;

public class Main {
	public static void main(String[] args) {
		SUV alto=new SUV(); 
		Motocycle r15=new Motocycle();
		
			alto.setEngineOn();
			alto.gearUp();
			alto.setRadioOn();
			System.out.println("Car \nEngine : "+alto.engineStatus()+
					"\nGear : "+alto.getGear()+
					"\nRadio : "+alto.radioStatus()+
					"\nMoving : "+alto.isMoving());
		
			r15.setEngineOn();
			r15.gearUp();
			//r15.setRadioOn();
			System.out.println("\n\nBike \nEngine : "+r15.engineStatus()+
					"\nGear : "+r15.getGear()+
					"\nMoving : "+r15.isMoving());
	}
}
