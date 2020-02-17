package Employeehierarchy;

public class Manager extends EMP{
	public String des="Manager";
	public String getDesignation() {
		return des;
	}
	public String reportsTo() {
		return "Reports to CTO";
	}
}
