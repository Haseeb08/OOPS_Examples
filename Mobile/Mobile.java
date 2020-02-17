package Mobile;

public abstract class Mobile {
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
