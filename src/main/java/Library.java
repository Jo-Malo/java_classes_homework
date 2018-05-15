import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> collection;
    private int capacity;

    public Library(String name){
        this.name = name;
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.collection.size();
    }

    public void getBook(Book book) {
        this.collection.add(book);
    }

    public int getCapacity(){
       return this.capacity = 10;
    }

    public void addBookIfCapacityFull(Book book){
        if (bookCount() < getCapacity()){
            this.collection.add(book);
        }
    }
}
