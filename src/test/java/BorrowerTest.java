import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book();
    }

    @Test
    public void canAddBook(){
      borrower.addtoRepository(book);
      assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canGetBook(){
        borrower.addtoRepository(book);
        borrower.removeBook();
        assertEquals(0, borrower.bookCount());
    }
}
