package Employeehierarchy;

public class CTO extends Manager{
	public String des="CTO";
	public String getDesignation() {
		return des;
	}
	public String reportsTo() {
		return "Reports to CEO";
	}
}
