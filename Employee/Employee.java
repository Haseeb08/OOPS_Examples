package Employee;

public class Employee implements Iemployee{

	private String empName;
	private String empDesignation;
	private int empExp;
	private double sal;
	
	public Employee(String empName,String empDesignation,int empExp) {
		this.empName=empName;
		this.empDesignation=empDesignation;
		this.empExp=empExp;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public int getEmpExp() {
		return empExp;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double amt) {
		sal=amt;
	}
	
}
