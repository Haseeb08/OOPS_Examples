package Pen;

public class Ballpen extends Pen implements Button{
    public Ballpen(String brand, String inkColor) {
		super(brand, inkColor);
		// TODO Auto-generated constructor stub
	}
    public String b(){
    return "this pen have a click button on top.";
    }
    public String displayPenDetails() {
    return "Brand:"+brand+" Ink: "+inkColor+" and "+b();
    }}
