package practice2;

//Employee Hierarchy CEO->CTO->MANAGER->EMPLOYEE
public class EmployeeHierarchy {
	public static void main(String[] args) {
		person emp=new Emp();
		emp.setName("Haseeb");
		emp.displayDetails();
		
		person manager =new Manager();
		manager.setName("Nabanita");
		manager.displayDetails();
		
		person  cto=new CTO();
		cto.setName("Sowmya");
		cto.displayDetails();
	}
}
abstract class person {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void displayDetails() {
		System.out.println("\n\nName : "+getName()+"\nDesignation:"+getDesignation()+ "\n"+reportsTo());
	
	}
	protected abstract String getDesignation();
	protected abstract String reportsTo();
}
class Emp extends person {
	private String des="Employee";
	public String getDesignation() {
		return des;
	}
	public String reportsTo() {
		return "Reports to manager";
	}
}
class Manager extends Emp {
	public String des="Manager";
	public String getDesignation() {
		return des;
	}
	public String reportsTo() {
		return "Reports to CTO";
	}
} 
class CTO extends Manager{
	public String des="CTO";
	public String getDesignation() {
		return des;
	}
	public String reportsTo() {
		return "Reports to CEO";
	}
}
class CEO extends CTO{
	public String des="CEO";
	public String getDesignation() {
		return des;
	}
	public String reportsTo() {
		return "";
	}
}


