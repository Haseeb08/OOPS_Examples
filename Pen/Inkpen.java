package Pen;

public class Inkpen extends Pen{
    public Inkpen(String brand,String inkColor) {
    super(brand,inkColor);
    }
    public String displayPenDetails() {
    return "Brand:"+brand+" Ink: "+inkColor;
    }}
