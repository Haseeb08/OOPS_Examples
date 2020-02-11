//Family tree 
interface grandFather {
	public void grandFatherDetail();
}
interface grandMother {
	public void grandMotherDetail();
}
interface Mother {
	public void motherDetail();	
}
class Father implements grandFather,grandMother{
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
		System.out.println("Grandfather:\t Name: Jack");
	}
	public void grandMotherDetail() {
		System.out.println("Grandmother:\t Name: Judy");
	}

}

class Child extends Father implements Mother{

	public void ChildDetail() {
		System.out.println("Child: Name:"+getName()+" Age:"+getAge());
	}

	@Override
	public void motherDetail() {
		System.out.println("Mother:\t Name: Rachel");
		
	}
}

public class FamilyTree {
	
	public static void main() {
		Child child=new Child();
		child.setName("Emma");                 
		child.setAge(10);				// Jack    Judy
		Father father=new Father();			//	|  |
		father.setName("Ross");				//      Ross  Rachel
		father.setAge(35);				//	    |	|		
		child.ChildDetail();				//           Emma
		father.fatherDetail();
		child.motherDetail();
		father.grandFatherDetail();
		father.grandMotherDetail();
		
	}
}
