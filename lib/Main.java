package lib;

public class Main {

	public static void main(String[] args ) {
		
		Member m1=new Member("Jake",123);
		Book b1=new Book("The song of ice and fire","G Martin");
		Book b2=new Book("Deception Point","Dan Brown");
		Library lib=new Library();
		lib.getBook(b1,m1);
		lib.getBook(b1,m1);
		lib.getBook(b2,m1);

	}
}
