package Uber;

public abstract class Ubervehicle {
	private int regNo;
	private String driverName;
	private int driverNo;
	public Ubervehicle(int regNo,int driverNo, String driverName) {
		this.regNo=regNo;
		this.driverName=driverName;
		this.driverNo=driverNo;
	}
	abstract String displayVehicleDetails();

	public int getRegNo() {
		return regNo;
	}

	public String getDriverName() {
		return driverName;
	}

	public int getDriverNo() {
		return driverNo;
	}
}
