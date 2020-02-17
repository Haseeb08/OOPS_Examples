package Uber;

public class Uberauto extends Ubervehicle{
	public Uberauto(int regNo,int driverNo, String driverName) {
		super(regNo,driverNo,driverName);
	}
	public String displayVehicleDetails() {
		return "\n\nUber Auto : Bajaj auto"+"\nReg no:"+getRegNo()+"\nDriver Name: "+getDriverName()+"\nDriver Ph: "+getDriverNo();
	}
}
