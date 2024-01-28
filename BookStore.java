// BookStore.java
package Practical_2_25_01;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;

    public BookStore() {
        this.books = new ArrayList<>();
        // Initializing with 5 sample books
        books.add(new Book(1, "Java Programming", "John Doe", 29.99));
        books.add(new Book(2, "Python Essentials", "Jane Smith", 24.99));
        books.add(new Book(3, "C++ Programming", "Bob Johnson", 34.99));
        books.add(new Book(4, "Web Development", "Alice Williams", 19.99));
        books.add(new Book(5, "Data Science with R", "Chris Brown", 39.99));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public boolean isBookAvailable(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return true;
            }
        }
        return false;
    }
}
