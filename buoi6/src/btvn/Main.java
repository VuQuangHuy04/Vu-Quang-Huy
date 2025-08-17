package btvn;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("chọn");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách theo tác giả");
            System.out.println("4. Xóa sách theo ID");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // bỏ ký tự Enter

            switch (choice) {
                case 1:
                    System.out.print("Nhập tiêu đề: ");
                    String title = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String author = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Nhập tên NXB (Enter = Unknown): ");
                    String pubName = sc.nextLine();
                    System.out.print("Nhập địa chỉ NXB (Enter = Unknown): ");
                    String pubAddress = sc.nextLine();

                    Publisher publisher;
                    if (pubName.isEmpty() || pubAddress.isEmpty()) {
                        publisher = new Publisher("Unknown", "Unknown");
                    } else {
                        publisher = new Publisher(pubName, pubAddress);
                    }

                    Book book = new Book(title, author, price, publisher);
                    library.addBook(book);
                    System.out.println("Thêm sách thành công!");
                    break;

                case 2:
                    System.out.print("Hiển thị NXB? (true/false): ");
                    boolean showPublisher = sc.nextBoolean();
                    library.displayAllBooks(showPublisher);
                    break;

                case 3:
                    System.out.print("Nhập tên tác giả cần tìm: ");
                    String searchAuthor = sc.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;

                case 4:
                    System.out.print("Nhập ID sách cần xóa: ");
                    int id = sc.nextInt();
                    library.removeBookById(id);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);

        sc.close();
    }
}
