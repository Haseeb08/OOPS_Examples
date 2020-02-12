package practice2;

public class Uber {
	public static void main(String[] args) {
		User u = new User();
		u.setName("Haseeb");
		u.setPhNo(12345);
		
		Ubervehicle v=new uberBike(9001,123123,"Jake");
		Booking b=new Booking("Hitech cty","Raidurg");
		b.bookBike(v, u);
		
	}
}
class User{
	private int phNo;
	private String name;
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
class Booking {
	private String startPoint;
	private String endPoint;
	public Booking(String startPoint,String endPoint) {
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}
	public void bookBike(Ubervehicle v,User u) {
		displayBookingDetails(v,u);
	}
	public void bookAuto(Ubervehicle v,User u) {
		displayBookingDetails(v,u);
	}
	public void bookCar(Ubervehicle v,User u) {
		displayBookingDetails(v,u);
	}
	private void displayBookingDetails(Ubervehicle v, User u) {
		System.out.println("\nBooking Successful\n\nRide Details:\nStarting Location: "+startPoint+
				"\nDestination: "+endPoint+v.displayVehicleDetails()+
				"\nUser:\nName: "+u.getName()+"\nPhone Number: "+u.getPhNo());
	}
}
abstract class Ubervehicle {
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
class uberBike extends Ubervehicle{
	public uberBike(int regNo,int driverNo, String driverName) {
		super(regNo,driverNo,driverName);
	}
	public String displayVehicleDetails() {
		return "\n\nUber Bike: Activa"+ 
				"\nReg no:"+getRegNo()+"\nDriver Name: "+getDriverName()+"\nDriver Ph: "+getDriverNo();
	}
}
class uberGo extends Ubervehicle{
	public uberGo(int regNo,int driverNo, String driverName) {
		super(regNo,driverNo,driverName);
	}
	public String displayVehicleDetails() {
		return "\n\nUber Go : Swift"+"\nReg no:"+getRegNo()+"\nDriver Name: "+getDriverName()+"\nDriver Ph: "+getDriverNo();
	}
}
class uberAuto extends Ubervehicle{
	public uberAuto(int regNo,int driverNo, String driverName) {
		super(regNo,driverNo,driverName);
	}
	public String displayVehicleDetails() {
		return "\n\nUber Auto : Bajaj auto"+"\nReg no:"+getRegNo()+"\nDriver Name: "+getDriverName()+"\nDriver Ph: "+getDriverNo();
	}
}