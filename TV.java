package practice2;
//Television: 3 types 
//1. CRT  2.LCD 3.LED 
// LED,LCD TVs are connected to hometheatre.
//LED TVS have Dolby Atmos sound system.
public class TV {
	public static void main(String[] args) {
		tv x=new CRT();
		LED y= new LED();
		LCD z=new LCD();
		x.displayType();x.changeChannel();x.changeChannel(50);y.increaseVolume();
		y.displayType();y.changeChannel();y.changeChannel(20);y.increaseVolume();y.ht();y.sd();
		z.displayType();z.changeChannel();z.changeChannel(10);z.increaseVolume();z.ht();
	}	
}
abstract class tv {
	public void changeChannel() {
		System.out.println("Channel changed");
	}
	public void changeChannel(int no) {
		System.out.println("Channel changed to "+no);
	}
	public void increaseVolume() {
		System.out.println("Volume Increased.");
	}
	public void decreaseVolume() {
		System.out.println("Volume decreased.");
	}
	abstract void displayType();
}
interface homeTheatre {
	public void ht(); 
}
interface Soundcard {
	public void sd();
}
class CRT extends tv{
	@Override
	void displayType() {
		System.out.println("\nType: CRT");
	}	
}
class LED extends tv implements Soundcard,homeTheatre {
	@Override
	void displayType() {
		System.out.println("\nType: LED");
	}
	@Override
	public void ht() {
		System.out.println("Home Theartre connected.");
	}
	@Override
	public void sd() {
			System.out.println("Supported by Dolby Atmos.");
		}
}
class LCD extends tv implements homeTheatre {
	@Override
	void displayType() {
		System.out.println("\nType: LCD");
	}
	@Override
	public void ht() {
		System.out.println("Home Theartre connected.");
	}
}
