package practice2;
//Vehicle : Car and Bike
// Accelerate and Brake functions : Increase and decrease the speed.

public class VehicleMain {
	public static void main(String[] args) {
		Car audiR8=new Car();
		System.out.println(audiR8.getVehcleType()+"\nTyres: "+audiR8.getNoOfTyres());
		System.out.println("Accelerating...!!");
		audiR8.accelerate();
		audiR8.accelerate();
		System.out.println("Speed: "+audiR8.getSpeed());
		audiR8.brake();
		System.out.println("Applying Brake...!!\nSpeed: "+audiR8.getSpeed());
		
		Bike R15=new Bike();
		System.out.println("\n\n"+R15.getVehcleType()+"\nTyres: "+R15.getNoOfTyres());
		System.out.println("Accelerating...!!");
		R15.accelerate();
		R15.accelerate();
		R15.accelerate();
		System.out.println("Speed: "+R15.getSpeed());
		R15.brake();
		System.out.println("Applying Brake...!!\nSpeed: "+R15.getSpeed());
	}
}

abstract class Vehicle {
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

class Car extends Vehicle {
	private int noOfTyres=4;
	public int getNoOfTyres(){
		return noOfTyres;
	}
	public String getVehcleType() {
		return "Vehicle: Car";
	}
}

class Bike extends Vehicle {
	private int noOfTyres=2;
	public int getNoOfTyres(){
		return noOfTyres;
	}
	public String getVehcleType() {
		return "Vehicle: Bike";
	}
}