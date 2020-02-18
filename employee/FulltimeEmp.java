package employee;

public class FulltimeEmp extends Employee implements Ibonus{
    private int empExp;
    public FulltimeEmp(String empName,String empDesignation,int empExp) {
        super(empName,empDesignation);
        this.empExp=empExp;
    }
    public int getEmpExp() {
        return empExp;
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
    public String displayDetails(){
        return "\nName : "+getEmpName()+
        "\nDesignation : "+getEmpDesignation()+
        "\nExperience : "+getEmpExp()+
        "\nSalary : "+getSal();
}
}
