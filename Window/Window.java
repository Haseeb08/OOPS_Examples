package Window;

public abstract class Window {
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
