package Mobile;

public class Smartphone extends Mobile implements Camera {
	public void capturePic() {
		System.out.println("Camera On: Pic taken");
	}
	public String calling() {
		return "Calling";
	}
	public String calling(String type) {
		return type+" Calling";
	}}
