package Pen;

public class Main {
	public static void main(String[] args){
	    Pen p1=new Gelpen("Cello","Blue");
	    Pen p2=new Ballpen("Techno","Red");
	    Pen p3=new Inkpen("Pilot","Black");
	    
	    System.out.println(p1.displayPenDetails());
	    System.out.println(p2.displayPenDetails());
	    System.out.println(p3.displayPenDetails());
	    }
}
