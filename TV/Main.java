package TV;
//Television: 3 types 
//1. CRT  2.LCD 3.LED 
//LED,LCD TVs are connected to hometheatre.
//LED TVS have Dolby Atmos sound system.
public class Main {
	public static void main(String[] args) {
		TV x=new CRT();
		LED y= new LED();
		LCD z=new LCD();
		x.displayType();x.changeChannel();x.changeChannel(50);y.increaseVolume();
		y.displayType();y.changeChannel();y.changeChannel(20);y.increaseVolume();y.ht();y.sd();
		z.displayType();z.changeChannel();z.changeChannel(10);z.increaseVolume();z.ht();
	}	
}
