package employee;

public class Main {
	public static void main(String[] args) {
        FulltimeEmp emp1=new FulltimeEmp("Jake","Software Engg",2);
        Intern i1=new Intern("Haseeb","ASE",6);
        emp1.setSal(50000);
        i1.setSal(20000);
        System.out.println("\nEmployee details: "+emp1.displayDetails()); 
        emp1.addBonus();
        System.out.println("Salary after adding bonus : "+emp1.getSal());
        System.out.println("\nIntern details: "+i1.displayDetails()); 
    }
}
