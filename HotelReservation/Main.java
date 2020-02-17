package HotelReservation;

public class Main {
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
