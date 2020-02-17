package Familytree;

public class Child extends Father implements Mother{

	public void ChildDetail() {
		System.out.println("Child: Name:"+getName()+" Age:"+getAge());
	}

	@Override
	public void motherDetail() {
		System.out.println("Mother:\t Name: Rachel");
		
	}
}
