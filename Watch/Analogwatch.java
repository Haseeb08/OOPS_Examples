package Watch;

public class Analogwatch extends Watch{
	@Override
	void display() {
		System.out.println("\nAnalog \nBrand : "+getBrand()+
							"\nTime : "+getTime()+
							"\nDate : "+getDate());
	}	
}
