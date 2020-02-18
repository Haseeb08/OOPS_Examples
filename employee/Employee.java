package employee;

public abstract class Employee {
	private String empName;
    private String empDesignation;
    private double sal;
    
    public Employee(String empName,String empDesignation) {
        this.empName=empName;
        this.empDesignation=empDesignation;
        
    }
    public String getEmpName() {
        return empName;
    }
    public String getEmpDesignation() {
        return empDesignation;
    }
    
    public double getSal() {
        return sal;
    }
    public void setSal(double amt) {
        sal=amt;
    }
    abstract String displayDetails();
}
