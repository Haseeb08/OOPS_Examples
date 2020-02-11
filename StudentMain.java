package practice2;
//Student : 1. Undergraduate 2. Postgraduate with research paper. 

public class StudentMain {
	public static void main(String[] args) {
	Student s1=new underGraduate("Haseeb",21); 
	Student s2=new postGraduate("Jake",24); 
	s1.studentDetails();
	s2.studentDetails();
	}
}
interface research{
	public String researchPaper();
}
abstract class Student{
	private String name;
	private int age;
	public Student(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void studentDetails();
}
class underGraduate extends Student {
	public underGraduate(String name,int age) {
		super(name,age);
	}

	@Override
	public void studentDetails() {
		System.out.println("\nStudent : Undergraduate\nName : "+getName()+"\nAge : "+getAge());
	}
}
class postGraduate extends Student implements research {
	public postGraduate(String name,int age) {
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