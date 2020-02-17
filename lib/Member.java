package lib;

public class Member {
	private String memName;
	private int memID;
	
	public Member(String memName,int ID) {
		this.memName=memName;
		this.memID=ID;
	}
	
	public String getMemName() {
		return memName;
	}
}
