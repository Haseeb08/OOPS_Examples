package Laptop;

public class Officelaptop extends Laptop {
    public Officelaptop(String Name) {
    super(Name);
    }
    public void showLaptopDetails(){
        System.out.println("Office Laptop: "+Name+"\nBattery :"+getBattery()+"\nOn Status : "+getOnstatus());
    }
}
