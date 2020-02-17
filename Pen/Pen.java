package Pen;

public abstract class Pen {
	protected String brand;
    protected String inkColor;
    //private boolean ink;
    
    public Pen(String brand,String inkColor){
        this.brand=brand;
        this.inkColor=inkColor;
        //ink=true;
    }
    
    abstract public String displayPenDetails();
}
