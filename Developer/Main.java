package Developer;

public class Main {
	public static void main(String[] args) {
		Developer sr=new Seniordev();
		Developer jr=new Juniordev();
		sr.setName("Jake");
		sr.setExp(10);
		sr.developerDetails();
		
		jr.setName("Rose");
		jr.setExp(2);
		jr.developerDetails();
	}
}
