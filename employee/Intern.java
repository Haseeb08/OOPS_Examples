package employee;

public class Intern extends Employee {
    int internshipPeriod;
public Intern(String empName,String empDesignation,int internshipPeriod) {
        super(empName,empDesignation);
        this.internshipPeriod=internshipPeriod;
}
public int getInternshipPeriod(){
return internshipPeriod;
}
public String displayDetails(){
        return "\nName : "+getEmpName()+
        "\nDesignation : "+getEmpDesignation()+
        "\nInternship period : "+getInternshipPeriod()+
        "\nStipend : "+getSal();
}
}
