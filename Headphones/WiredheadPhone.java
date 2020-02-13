package headPhones;

public class WiredheadPhone extends Headphone{     //Inheritance

	@Override
	void diplayDetails() {
		System.out.println("\nHeadphone: \nType: Wired\nBrand Name: "+getBrandName()+
				"\nBass: "+isBass()+
				"\nPrice: "+getPrice());
	}

}
