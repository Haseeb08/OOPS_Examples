package Vehicle2;

public class Vehicle implements IEngine{
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
