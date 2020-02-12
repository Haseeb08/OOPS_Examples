package practice2;
//Hotel Reservation System

public class HotelReservation {
	public static void main(String[] args) {
		Customer c=new Customer();
		c.setName("Haseeb");
		c.setPhNo(122345);
		Room r=new Room();
		r.setRoomNo(101);
		r.setRoomType("Suite");
		Hotelbooking b=new Hotelbooking("09:00 AM 12-2-20","08:30 PM 14-2-20",3);
		b.bookRoom(r, c);
	}	
}
class Customer{
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
class Hotelbooking{
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
class Room {
	private int roomNo;
	private String roomType;
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String displayRoomDetails() {
		return "\nRoom no :"+getRoomNo()+"\nRoom type : "+getRoomType();
	}
}