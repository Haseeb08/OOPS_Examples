 
 abstract class Book {
     private String bookName;
    private String Author;
    protected boolean available;
    
    public Book(String bookName,String Author) {
        this.bookName=bookName;
        this.Author=Author;
        available=true;
    }
    public String getBookname() {
		return bookName;
    }
     public boolean isAvailable() {
		return available;
       }
    abstract String typeOfBook();   
}

class studyBook extends Book {
    
    
    public studyBook(String bookName,String Author) {
       super(bookName,Author);
    }
    public String typeOfBook() {
    return "Study";
    }
    }
    
class Magzines extends Book {
   
    public Magzines(String magName,String publisherName){
        super(magName,publisherName);
    }
    public String typeOfBook() {
    return "magzine";
    }
}
 class Library {

    public void getBook(Book b,Member m) {
        b.typeOfBook();
        if(b.isAvailable())
        {
            System.out.println("Type :"+b.typeOfBook()+" || "+b.getBookname()+" is issued to "+m.getMemName());
            b.available=false;
        }
        else
        System.out.println("Book not available");
    }
    public void retbook(Book b,Member m ) {
        
        System.out.println("Type :"+b.typeOfBook()+" || "+b.getBookname()+" is returned by"+m.getMemName());
        b.available=true;
    }
}

class Member {

    private String memName;
    private int memID;
    
    public Member(String memName,int ID) {
        this.memName=memName;
        this.memID=ID;
    }
    
    public String getMemName() {
        return memName;
    }
}


public class library_main {

    public static void main() {
        
        Member m1=new Member("Jake",123);
        Book b1=new studyBook("The song of ice and fire","G Martin");
        Book b2=new Magzines("Forbes","xyz");
        Library lib=new Library();
        lib.getBook(b1,m1);
        lib.getBook(b1,m1);
        lib.getBook(b2,m1);

    }
}
