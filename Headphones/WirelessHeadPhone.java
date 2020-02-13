package headPhones;

public class WirelessHeadPhone extends Headphone implements Bluetooth{      //Inheritance

	@Override
	void diplayDetails() {                          
		System.out.println("\nHeadphone: \nType: Wireless\nBrand Name: "+getBrandName()+
				"\nBass: "+isBass()+
				"\nPrice: "+getPrice());	
	}
	@Override
	public String setBluetoothOn() {
		return "Bluetooth is ON";
	}
	@Override
	public String setBluetoothOff() {
		return "Bluetooth is Off";
	}
}
