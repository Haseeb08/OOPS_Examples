package Familytree;

public class Main {
	public static void main(String[] args) {
		Child child=new Child();
		child.setName("Emma");
		child.setAge(10);
		Father father=new Father();
		father.setName("Ross");
		father.setAge(35);		
		child.ChildDetail();
		father.fatherDetail();
		child.motherDetail();
		father.grandFatherDetail();
		father.grandMotherDetail();
		
	}

}
