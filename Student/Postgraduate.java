package Student;

public class Postgraduate extends Student implements Research {
	public Postgraduate(String name,int age) {
		super(name,age);
	}
	public String researchPaper() {
		return "Research paper: XYZ";
	}
	@Override
	public void studentDetails() {
		System.out.println("\nStudent : Postgraduate\n"+researchPaper()+"\nName : "+getName()+"\nAge : "+getAge());	
	}
}
