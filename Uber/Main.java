package Uber;

public class Main {
	public static void main(String[] args) {
		User u = new User();
		u.setName("Haseeb");
		u.setPhNo(12345);
		
		Ubervehicle v=new Uberbike(9001,123123,"Jake");
		Booking b=new Booking("Hitech cty","Raidurg");
		b.bookBike(v, u);
		
	}
}
