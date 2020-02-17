package Uber;

public class Booking {
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
