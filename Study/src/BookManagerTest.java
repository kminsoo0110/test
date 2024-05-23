import java.util.List;

public class BookManagerTest {
	
	public void testAddBook(List<Book> bookList, int id, String title, String author, int year) {
		if(bookList.contains(new Book(id,title,author,year))) {
			System.out.println("해당 ID(" + id + ") 는 이미 존재합니다.");
			return;
		} else {
			bookList.add(new Book(id, title, author, year));
			System.out.println("Book(id : '" + id + "', 제목 : '" + title + "', 저자 : '" + author + "', 출판년도 : " + year + ")도서가 추가되었습니다.");
		}
	}
	
	public void testSearchBook(List<Book> bookList, int id) {
		if(bookList.contains(new Book(id,"","",0))) {
			int idx = bookList.indexOf(new Book(id,"","",0));
			System.out.println("검색 결과:");
			bookList.get(idx).show();
		} else {
			System.out.println("검색된 도서가 없습니다.");
			return;
		}
	}
	
	public void testRemoveBook(List<Book> bookList, int id) {
		if(bookList.contains(new Book(id,"","",0))) {
			int idx = bookList.indexOf(new Book(id,"","",0));
			Book selectedBook = bookList.get(idx);
			bookList.remove(idx);
			System.out.println("Book(id : '" + id + "', 제목 : '" + selectedBook.title + "', 저자 : '" + selectedBook.author + "', 출판년도 : " + selectedBook.publishedYear + ")도서를 삭제하였습니다.");
		} else {
			System.out.println("해당 ID(" + id + ")의 도서를 찾을 수 없습니다.");
			return;
		}
	}
}
