abstract class Laptop{

    protected boolean OnStatus;
    protected float battery;
    protected String Name;
    
    public Laptop(String Name) {
    //this.OnStatus=true;
    this.battery=75;
    this.Name=Name;
    }
    public boolean getOnstatus(){
    return OnStatus;
    }
    public float getBattery(){
    return battery;
    }
    public void setBattery(float perc){
    battery=perc;
    }
    public void setOnStatus(boolean b){
    OnStatus=b;
    }
    
    abstract void showLaptopDetails();
}

interface HighGraphics {
    public String GraphicCard();
}
class GamingLaptop extends Laptop implements HighGraphics{
    
    public GamingLaptop(String Name) {
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

class OfficeLaptop extends Laptop {
    public OfficeLaptop(String Name) {
    super(Name);
    }
    public void showLaptopDetails(){
        System.out.println("Office Laptop: "+Name+"\nBattery :"+getBattery()+"\nOn Status : "+getOnstatus());
    }
}
public class LaptopMain
{
    public static void main() {
    
        Laptop l1=new GamingLaptop("Predetor");
        l1.setOnStatus(true);
        l1.showLaptopDetails();
        
        Laptop l2=new OfficeLaptop("Dell");
        l2.setBattery(55);
        l2.setOnStatus(true);
        l2.showLaptopDetails();
    }   
}
