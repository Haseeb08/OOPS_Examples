package Employee;

public class FulltimeEmp extends Employee implements Ibonus{

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