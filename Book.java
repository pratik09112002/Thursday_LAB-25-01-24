/*
 Create a Book class to store Books information(bookid, title, author name, price).Create an object 
 and assign values to Book variables and print them using a method.For printing use the bookid 
 if the book is available so display the details and if book is not available show the msg by using exception.
  
 */
// Book.java
// Book.java
package Practical_2_25_01;

public class Book {
    private int bookId;
    private String title;
    private String authorName;
    private double price;

    public Book(int bookId, String title, String authorName, double price) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    // Display details of a single book
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + authorName);
        System.out.println("Price: $" + price);
    }
}

