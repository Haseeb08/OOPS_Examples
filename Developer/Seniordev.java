package Developer;

public class Seniordev extends Developer implements Majorproject{
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
