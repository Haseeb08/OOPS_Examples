package Student;

public class Undergraduate  extends Student {
		public Undergraduate(String name,int age) {
			super(name,age);
		}

		@Override
		public void studentDetails() {
			System.out.println("\nStudent : Undergraduate\nName : "+getName()+"\nAge : "+getAge());
		}
	}

