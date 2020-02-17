package Uber;

public class Uberbike extends Ubervehicle{
	public Uberbike(int regNo,int driverNo, String driverName) {
		super(regNo,driverNo,driverName);
	}
	public String displayVehicleDetails() {
		return "\n\nUber Bike: Activa"+ 
				"\nReg no:"+getRegNo()+"\nDriver Name: "+getDriverName()+"\nDriver Ph: "+getDriverNo();
	}
}
