package Watch;

public class Main {
	public static void main(String[] args) {
		Watch w1=new Digitalwatch();
		w1.setBrand("G-Shock");
		Watch w2=new Analogwatch();
		w2.setBrand("Rado");
		w1.display();
		w2.display();
		
	}
}
