package Window;
//Window 
//Two types of windows : Glass and wooden
//Glass window have sliding feature.
public class Main {
	public static void main(String[] args){
	       Window w1=new Glasswindow();
	       Woodenwindow w2=new Woodenwindow();
	       w1.setDimensions(10, 15);
	       w2.setDimensions(8, 10);
	       System.out.println("Window of type: "+w1.material()+"\nArea : "+w1.calculateArea());
	       System.out.println("Window of type: "+w2.material()+"\nArea : "+w2.calculateArea());
	    }
}
