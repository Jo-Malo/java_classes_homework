import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library("Central Library");
        book = new Book();
        borrower = new Borrower();
        borrower.addtoRepository(book);
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canGetBook(){
        library.getBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void getCapacity(){
        assertEquals(10, library.getCapacity());
    }

    @Test
    public void addBookIfCapacityFull(){
        library.addBookIfCapacityFull(book);
        assertEquals(1, library.bookCount());
    }
}
