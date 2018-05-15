import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> repository;

    public Borrower(){
        this.repository = new ArrayList<>();
    }

    public void addtoRepository(Book book){
        this.repository.add(book);
    }

    public int bookCount() {
        return this.repository.size();
    }

    public Book removeBook(){
        return this.repository.remove(0);
    }
}
