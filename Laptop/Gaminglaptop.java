package Laptop;

public class Gaminglaptop extends Laptop implements Highgraphics{
    
    public Gaminglaptop(String Name) {
    super(Name);
    }
    public String GraphicCard(){
    return "Graphic Card Installed";
    }
    
    public void showLaptopDetails(){
        System.out.println("Gaming Laptop: "+Name+"\nBattery :"+getBattery()+"\nOn Status : "+getOnstatus());
        System.out.println(GraphicCard());
    }
    }
