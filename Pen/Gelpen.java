package Pen;

public class Gelpen extends Pen{
    public Gelpen(String brand,String inkColor) {
    super(brand,inkColor);
    }
    public String displayPenDetails() {
    return "Brand:"+brand+" Ink: "+inkColor;
    }}
