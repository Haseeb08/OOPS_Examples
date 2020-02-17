package lib;

public class Library {
	public void getBook(Book b,Member m) {
		if(b.isAvailable())
		{
			System.out.println("Book "+b.getBookname()+" is issued to "+m.getMemName());
			b.available=false;
		}
		else
		System.out.println("Book not available");
	}
	public void retbook(Book b,Member m ) {
		System.out.println("Book "+b.getBookname()+" is returned by"+m.getMemName());
		b.available=true;
	}
}
