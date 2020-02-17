package Employeehierarchy;

public class EMP extends Person{
	private String des="Employee";
	public String getDesignation() {
		return des;
	}
	public String reportsTo() {
		return "Reports to manager";
	}
}
