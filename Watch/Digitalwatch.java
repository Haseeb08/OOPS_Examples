package Watch;

public class Digitalwatch extends Watch{
	@Override
	void display() {
		System.out.println("Digital \nBrand : "+getBrand()+
				"\nTime : "+getTime()+
				"\nDate : "+getDate());
		
	}
}
