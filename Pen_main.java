
abstract class Pen
{
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
interface button{
public String b();
}

class Gel extends Pen{
    public Gel(String brand,String inkColor) {
    super(brand,inkColor);
    }
    public String displayPenDetails() {
    return "Brand:"+brand+" Ink: "+inkColor;
    }
}

class Ball extends Pen implements button{
    public Ball(String brand,String inkColor) {
    super(brand,inkColor);
    }
    public String b(){
    return "this pen have a click button on top.";
    }
    public String displayPenDetails() {
    return "Brand:"+brand+" Ink: "+inkColor+" and "+b();
    }
}

class Inkpen extends Pen{
    public Inkpen(String brand,String inkColor) {
    super(brand,inkColor);
    }
    public String displayPenDetails() {
    return "Brand:"+brand+" Ink: "+inkColor;
    }
}

public class Pen_main {

    public static void main(){
    Pen p1=new Gel("Cello","Blue");
    Pen p2=new Ball("Techno","Red");
    Pen p3=new Inkpen("Pilot","Black");
    
    System.out.println(p1.displayPenDetails());
    System.out.println(p2.displayPenDetails());
    System.out.println(p3.displayPenDetails());
    }
}
