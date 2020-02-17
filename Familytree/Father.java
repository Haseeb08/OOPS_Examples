package Familytree;

public class Father implements grandfather,grandmother{
	private String name;
	private int age;
	
	
	public void fatherDetail() {
			System.out.println("Father: name "+name+" Age: "+age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void grandFatherDetail() {
		System.out.println("Grandfather:\t Name: Mike");
	}
	public void grandMotherDetail() {
		System.out.println("Grandmother:\t Name: Jane");
	}

}