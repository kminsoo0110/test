import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookManagerTestTest {
	
	private BookManagerTest Junit;
	public List<Book> bookList; // bookList 선언

	@BeforeEach
	void setUp() throws Exception {
		bookList = new ArrayList<Book>(); // bookList 선언
		Junit  = new BookManagerTest();
	}

	@Test
	@Order(1)
	void testTestAddBook() {
		Junit.testAddBook(bookList,1,"자바 기초","Jane",2021);
		Junit.testAddBook(bookList,1,"자바 기초","Jane",2021);
		Junit.testSearchBook(bookList, 1); 
		//fail("Not yet implemented");
	}

	@Test
	@Order(2)
	void testTestSearchBook() {
		System.out.println();
		Junit.testAddBook(bookList,1,"자바 기초","Jane",2021);
		Junit.testAddBook(bookList,2,"소프트웨어 공학","Tom",2014);
		Junit.testAddBook(bookList,3,"분산 컴퓨팅","Yoon",2024);
		Junit.testSearchBook(bookList, 1);
		Junit.testSearchBook(bookList, 2);
		Junit.testSearchBook(bookList, 3);
		Junit.testSearchBook(bookList, 4);
		//fail("Not yet implemented");
	}

	@Test
	@Order(3)
	void testTestRemoveBook() {
		System.out.println();
		Junit.testAddBook(bookList,1,"자바 기초","Jane",2021);
		Junit.testAddBook(bookList,2,"소프트웨어 공학","Tom",2014);
		Junit.testRemoveBook(bookList, 1);
		Junit.testRemoveBook(bookList, 1);
		Junit.testSearchBook(bookList, 1);
		//fail("Not yet implemented");
	}
	
	@Test
	@Order(4)
	void testTestBinarySearch() {
		System.out.println();
		Junit.testAddBook(bookList,1,"자바 기초","Jane",2021);
		Junit.testAddBook(bookList,2,"소프트웨어 공학","Tom",2014);
		Junit.testAddBook(bookList,3,"분산 컴퓨팅","Yoon",2024);
		Junit.testAddBook(bookList,5,"분산 컴퓨팅2","Yoon2",2024);
		Junit.testBinarySearch(bookList, 1);
		Junit.testBinarySearch(bookList, 2);
		Junit.testBinarySearch(bookList, 3);
		Junit.testBinarySearch(bookList, 4);
		Junit.testBinarySearch(bookList, 5);
		Junit.testRemoveBook(bookList, 5);
		Junit.testBinarySearch(bookList, 5);
		//fail("Not yet implemented");
	}

}
