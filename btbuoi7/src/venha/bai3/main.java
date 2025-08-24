package venha.bai3;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         ArrayList<Student> ds = new ArrayList<>();

         ds.add(new Student("S01", "An", 20, "an@gmail.com", "KTPM1", "HN", 8.5, 6));
         ds.add(new Student("S02", "Binh", 21, "binh@gmail.com", "KTPM2", "HCM", 7.2, 7));
         StudentManager manager = new StudentManager(ds);

            System.out.println("\n===== MENU =====");
            System.out.println("1. Hien thi danh sach hoc sinh");
            System.out.println("2. Sap xep theo diem giam dan");
            System.out.println("3. Sap xep theo diem tang dan");
            System.out.println("4. Tim kiem hoc sinh theo ten");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    manager.printStudents();
                    break;
                case 2:
                    manager.sortByScoreDesc();
                    break;
                case 3:
                    manager.sortByScoreAsc();
                    break;
                case 4:
                    System.out.print("Nhap ten can tim: ");
                    String name = sc.nextLine();
                    Student st = manager.findByName(name);
                    if (st != null) {
                        System.out.println("Tim thay: " + st);
                    } else {
                        System.out.println("Khong tim thay!");
                    }
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }while(choice != 0);



    }
}
