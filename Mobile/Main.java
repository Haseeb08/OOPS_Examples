package Mobile;

public class Main {
	public static void main(String[] args) {
		Mobile nokia7610=new Phone();
		Smartphone note5=new Smartphone();
		
		nokia7610.setRecieverNo(123456789);
		note5.setRecieverNo(123123123);
		
		System.out.println(nokia7610.calling()+" to "+nokia7610.getRecieverNo());
		System.out.println(note5.calling()+" to "+note5.getRecieverNo());
		note5.capturePic();
	}
}