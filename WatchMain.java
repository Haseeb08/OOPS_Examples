package practice2;

//Watch : two types 1. Digital 2. Analog

import java.time.LocalTime;
import java.time.LocalDate;

public class WatchMain {
	public static void main(String[] args) {
		watch w1=new digitalWatch();
		w1.setBrand("G-Shock");
		watch w2=new analogWatch();
		w2.setBrand("Rado");
		w1.display();
		w2.display();
		
	}
}

abstract class watch{
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getTime() {
		return (LocalTime.now()).toString();
	}
	public String getDate() {
		return (LocalDate.now()).toString();
	}
	abstract void display();
	
}
class digitalWatch extends watch{

	@Override
	void display() {
		System.out.println("Digital \nBrand : "+getBrand()+
				"\nTime : "+getTime()+
				"\nDate : "+getDate());
		
	}
	
}
class analogWatch extends watch{

	@Override
	void display() {
		System.out.println("\nAnalog \nBrand : "+getBrand()+
							"\nTime : "+getTime()+
							"\nDate : "+getDate());
	}
	
}