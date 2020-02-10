
interface camera {
	public void capturePic();
} 

public class Mobile {
	public static void main() {
		mobile nokia7610=new phone();
		mobile note5=new smartPhone();
		
		nokia7610.setRecieverNo(123456789);
		note5.setRecieverNo(123123123);
		
		System.out.println(nokia7610.calling()+" to "+nokia7610.getRecieverNo());
		System.out.println(note5.calling()+" to "+note5.getRecieverNo());
		note5.capturePic();
		
		
	}
}


abstract class mobile {

	//private int dailerNo;
	private int recieverNo;
	
	abstract public String calling();
	public String messaging(String msg) {
		return "Msg sent:"+msg;
	}
	
	
	public int getRecieverNo() {
		return recieverNo;
	}
	public void setRecieverNo(int recieverNo) {
		this.recieverNo = recieverNo;
	}
}

class phone extends mobile {
	
	public String calling() {
		return "Calling";
	}
	public String calling(String type) {
		return type+" Calling";
	}
}

class smartPhone extends mobile implements camera {
	public void capturePic() {
		System.out.println("Camera On: Pic taken");
	}
	public String calling() {
		return "Calling";
	}
	public String calling(String type) {
		return type+" Calling";
	}
}