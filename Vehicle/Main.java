package Vehicle;
//Vehicle : Car and Bike
//Accelerate and Brake functions : Increase and decrease the speed.

public class Main {
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
