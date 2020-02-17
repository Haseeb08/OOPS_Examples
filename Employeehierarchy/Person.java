package Employeehierarchy;

public abstract class Person {
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
