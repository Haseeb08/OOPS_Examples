package Employeehierarchy;

public class Main {
	public static void main(String[] args) {
		Person emp=new EMP();
		emp.setName("Haseeb");
		emp.displayDetails();
		
		Person manager =new Manager();
		manager.setName("Nabanita");
		manager.displayDetails();
		
		Person  cto=new CTO();
		cto.setName("Sowmya");
		cto.displayDetails();
	}
}
