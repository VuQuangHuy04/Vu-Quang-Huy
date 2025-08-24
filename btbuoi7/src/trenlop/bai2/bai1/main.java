package trenlop.bai2.bai1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("nhap title ");
            String title = sc.nextLine();
            System.out.println("nhap author");
            String author = sc.nextLine();
            books[i] = new Book(title,author);
        }
        for(Book b : books ){
            System.out.println(b.toString());
        }
    }
}
