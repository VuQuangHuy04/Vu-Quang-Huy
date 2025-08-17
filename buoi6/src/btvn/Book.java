package btvn;

public class Book {
    private static int bookId = 1;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.bookId = bookId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher("Unknown","Unknown");
    }
    public void displayInfo(){
        System.out.println("ID: " + bookId +
        ", Title: " + title +
                ", Author: " + author +
                ", Price: " + price);
    }
    public void displayInfo(boolean a){
        displayInfo();
        if(a){
            System.out.println(" "+ publisher.toString());
        }else{
            System.out.println("Publisher: Unknown");
        }
    }
    public static int getBookId() {
        return bookId;
    }

    public static void setBookId(int bookId) {
        Book.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
