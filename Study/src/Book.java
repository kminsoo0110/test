public class Book{
		int id;
		String title;
		String author;
		int publishedYear;
		
		public Book(int id, String title, String author, int year) {
			this.id = id;
			this.title = title;
			this.author = author;
			this.publishedYear = year;
		}
		
		public Book() {
			
		}
		
		public void show() {
			System.out.println("Book(id : '" + id + "', 제목 : '" + title + "', 저자 : '" + author + "', 출판년도 : " + publishedYear + ")");
		}
		
		@Override
		public boolean equals(Object obj) {
			Book tempBook = (Book)obj;
			return this.id == tempBook.id;
		}
	}