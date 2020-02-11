package practice2;
// Window 
// Two types of windows : Glass and wooden
// Glass window have sliding feature.

public class Window {
    public static void main(String[] args){
       window w1=new glassWindow();
       window w2=new woodenWindow();
       w1.setDimensions(10, 15);
       w2.setDimensions(8, 10);
       System.out.println("Window of type: "+w1.material()+"\nArea : "+w1.calculateArea());
       System.out.println("Window of type: "+w2.material()+"\nArea : "+w2.calculateArea());
    }
}

abstract class window {
    private float height;							//Encapsulation : Private fields and getters and setters to access them.
    private float width;
    public void setDimensions(float h,float w){
        this.height=h;
        this.width=w;
    }
    public void getDimensions(){
        getHeight();
        getWidth();
    }
    public float getHeight(){
        return  height;
    }
    public float getWidth(){
        return width;
    }
    public float calculateArea(){
        return height*width;
    }
    abstract String material();
}
interface slide {
    public String sliding(); 			//Abstraction : interface slide to hide the implementation of sliding method.
}
class glassWindow extends window implements slide{ 			//Inheritance : this class is extending to class window
    public String material(){
       System.out.println( sliding());
    	return "Glass";
    }
    public String sliding(){
        return "Sliding window";
    }
}
class woodenWindow extends window {
    public String material(){ 				//Polymorphism : overriding material method.
        return "Wood";
    }
}