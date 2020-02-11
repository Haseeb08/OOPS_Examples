 interface Iemployee {

	public String getEmpName();
	public String getEmpDesignation();
	public int getEmpExp();
	public double getSal(); 
}

class Employee implements Iemployee{

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
interface ibonus {

	public void addBonus();
	}

class FulltimeEmp extends Employee implements ibonus{

	public FulltimeEmp(String empName,String empDesignation,int empExp) {
		super(empName,empDesignation,empExp);
	}
	
	double bonus;
	public void addBonus( ) { 
		double sal=getSal();
		int exp=getEmpExp();
		bonus=sal*exp/10;
		setSal(sal+bonus);
	}
	public void addBonus(double amt)
	{   double sal=getSal();
		bonus=amt;
		setSal(sal+bonus);
	}	
}
public class EmployeeMain
{
 public static void main() {
		FulltimeEmp emp1=new FulltimeEmp("Jake","Software Engg",2);
		emp1.setSal(20000);
		System.out.println("Employee details: \n"+emp1.getEmpName()+
				"\t"+emp1.getEmpDesignation());
		System.out.println("Salary : "+emp1.getSal());
		emp1.addBonus();
		System.out.println("Salary : "+emp1.getSal());
			}
}
