package Employee;

public class Main {
	public static void main(String[] args) {
		FulltimeEmp emp1=new FulltimeEmp("Jake","Software Engg",2);
		emp1.setSal(20000);
		System.out.println("Employee details: \n"+emp1.getEmpName()+
				"\t"+emp1.getEmpDesignation());
		System.out.println("Salary : "+emp1.getSal());
		emp1.addBonus();
		System.out.println("Salary : "+emp1.getSal());
		
	}
}
