package Window;

public class Glasswindow extends Window implements Slide{
	  public String material(){
	       System.out.println( sliding());
	    	return "Glass";
	    }
	    public String sliding(){
	        return "Sliding window";
	    }
}
