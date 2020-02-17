package HotelReservation;

public class Hotelbooking {
	private int days;
	private String checkIn;
	private String checkOut;
	
	public Hotelbooking(String checkIn,String checkOut,int days) {
		this.checkIn=checkIn;
		this.checkOut=checkOut;
		this.days=days;
	}
	public void bookRoom(Room v,Customer u) {
		displayBookingDetails(v,u);
	}	
	private void displayBookingDetails(Room v,Customer u) {
		System.out.println("\nBooking Successful\n\nBooking Details:\nCheckIn: "+checkIn+
				"\nCheckout: "+checkOut+"\nDays: "+days+v.displayRoomDetails()+
				"\nUser:\nName: "+u.getName()+"\nPhone Number: "+u.getPhNo());
	}
}
