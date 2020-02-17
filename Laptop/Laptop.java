package Laptop;

public abstract class Laptop {

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
