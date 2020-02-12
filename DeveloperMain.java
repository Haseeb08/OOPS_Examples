package practice2;

public class DeveloperMain {
	public static void main(String[] args) {
		Developer sr=new seniorDeveloper();
		Developer jr=new juniorDeveloper();
		sr.setName("Jake");
		sr.setExp(10);
		sr.developerDetails();
		
		jr.setName("Rose");
		jr.setExp(2);
		jr.developerDetails();
	}
	
}
abstract class Developer {
	private String name;
	private float exp;
	abstract void  developerDetails();
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
interface majorProject{
	public String mp();
}
class seniorDeveloper extends Developer implements majorProject{

	@Override
	public String mp() {
		return "Handles major projects";
	}

	@Override
	void developerDetails() {
	System.out.print("Senior Developer :\nName : "
					+getName()+"\n Experience : "
						+getExp()+"\n"+mp());
	}	
}
class juniorDeveloper extends Developer{

	@Override
	void developerDetails() {
		System.out.print("\n\nJunior Developer :\nName : "+getName()+"\n Experience : "+getExp());
		}
}