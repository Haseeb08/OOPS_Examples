package Uber;

public class Ubergo extends Ubervehicle{
	public Ubergo(int regNo,int driverNo, String driverName) {
		super(regNo,driverNo,driverName);
	}
	public String displayVehicleDetails() {
		return "\n\nUber Go : Swift"+"\nReg no:"+getRegNo()+"\nDriver Name: "+getDriverName()+"\nDriver Ph: "+getDriverNo();
	}
}
