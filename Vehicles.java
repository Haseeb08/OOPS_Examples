package practice2;

public class Vehicles {
	public static void main(String[] args) {
		SUV alto=new SUV(); 
		Motorcycle r15=new Motorcycle();
		
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
class vehicle implements Iengine{
	private int gear=0;
	private boolean engine;
	public void gearUp() {
		gear++;
	}
	public void gearDown() {
		gear--;	
	}
	public int getGear() {
		return gear;
	}
	public boolean isMoving() {
		if(gear>0) 
			return true;
		else 
			return false;
	}
	@Override
	public void setEngineOn() {
		engine=true;
	}
	@Override
	public void setEngineOff() {
		engine=false;
	}
	@Override
	public boolean engineStatus() {
		return engine;
	}
}
interface Iengine{
	public void setEngineOn();
	public void setEngineOff();
	public boolean engineStatus();
}
interface Iradio{
	public void setRadioOn();
	public void setRadioOff();
	public boolean radioStatus();
}
class SUV extends vehicle implements Iradio{
	private boolean radio;
	@Override
	public void setRadioOn() {
		radio=true;
	}
	@Override
	public void setRadioOff() {
		radio=false;
	}
	@Override
	public boolean radioStatus() {
		return radio;
	}	
}
class Motorcycle extends vehicle{
	
}