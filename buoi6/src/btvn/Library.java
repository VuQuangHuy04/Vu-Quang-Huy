package btvn;

import java.util.ArrayList;
import java.util.Locale;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public Library(){}
    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public void displayAllBooks(boolean showPublisher){
        for (Book b : books) {
            b.displayInfo(showPublisher);
            System.out.println("------------------");
        }
    }
    public void searchByAuthor(String author){
        boolean found = false;
        for(Book b: books){
            if(b.getAuthor().toLowerCase().contains(author.toLowerCase())){
               b.displayInfo();
                found = true;
            }
        }
    }
    public void removeBookById(int bookId) {
        boolean removed = false;
        for (Book b : books) {
            if (b.getBookId() == bookId) {
                books.remove(b);
                System.out.println("Đã xóa sách có ID: " + bookId);
                removed = true;
                break;
            }
        }
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }


}
