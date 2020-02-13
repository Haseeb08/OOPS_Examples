package headPhones;

public class Main {
	public static void main(String[] args) {
		WiredheadPhone p1=new WiredheadPhone();
		p1.setBrandName("JBL");
		p1.setPrice(1500);
		p1.setBass(true);
		
		WirelessHeadPhone p2=new WirelessHeadPhone();
		p2.setBrandName("Boat");
		p2.setPrice(2500);
		p2.setBass(true);
		
		p1.diplayDetails();      //Polymorphism
		p2.diplayDetails();
		System.out.println(p2.setBluetoothOn());
		
	}
}
