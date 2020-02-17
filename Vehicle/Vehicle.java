package Vehicle;

public abstract class Vehicle {
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void accelerate(){
		speed+=10;
	}
	public void brake() {
		speed-=10;
	}
	abstract int getNoOfTyres();
	abstract String getVehcleType();
}
