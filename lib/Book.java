package lib;

public class Book {
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
	}

