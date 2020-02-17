package Laptop;

public class Main {
	public static void main(String[] args) {
	    
        Laptop l1=new Gaminglaptop("Predetor");
        l1.setOnStatus(true);
        l1.showLaptopDetails();
        
        Laptop l2=new Officelaptop("Dell");
        l2.setBattery(55);
        l2.setOnStatus(true);
        l2.showLaptopDetails();
    }
}
