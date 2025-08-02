package baitapvenha_bai2;
import java.util.Scanner;
import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<Student> students = new ArrayList<>();
        static {
        students.add(new Student("An", 2003, "Hà Nội", 7.5, 8.0, 9.0, 2));
        students.add(new Student("Bình", 2002, "Đà Nẵng", 6.0, 7.0, 8.0, 1));
        students.add(new Student("Chi", 2004, "TP.HCM", 9.0, 9.5, 10.0, 0));
        students.add(new Student("Dũng", 2003, "Hải Phòng", 5.0, 6.5, 7.0, 4));
        students.add(new Student("Hà", 2002, "Cần Thơ", 8.0, 7.5, 8.5, 3));
        }
        public static void main(String[] args) {
            while (true) {
                System.out.println("1. Thêm sinh viên");
                System.out.println("2. Sửa thông tin sinh viên");
                System.out.println("3. Xóa sinh viên");
                System.out.println("4. Sắp xếp theo tuổi");
                System.out.println("5. Sắp xếp theo GPA");
                System.out.println("6. Sắp xếp theo số tiết nghỉ");
                System.out.println("7. Hiển thị danh sách");
                System.out.println("0. Thoát");
                System.out.print("Chọn: ");
                int choice = sc.nextInt();
                sc.nextLine(); // bỏ qua Enter

                switch (choice) {
                    case 1 -> addStudent();
                    case 2 -> editStudent();
                    case 3 -> deleteStudent();
                    case 4 -> students.sort(Comparator.comparing(Student::getAge));
                    case 5 -> students.sort(Comparator.comparing(Student::getGpa).reversed());
                    case 6 -> students.sort(Comparator.comparing(Student::getAbsent_sessions));
                    case 7 -> showStudents();
                    case 0 -> {
                        System.out.println("Thoát chương trình.");
                        return;
                    }
                    default -> System.out.println("Lựa chọn không hợp lệ.");
                }
            }
        }

        static void addStudent() {
            System.out.print("Tên: ");
            String name = sc.nextLine();
            System.out.print("Năm sinh: ");
            int birthYear = sc.nextInt(); sc.nextLine();
            System.out.print("Địa chỉ: ");
            String address = sc.nextLine();
            System.out.print("Điểm TX1: ");
            double tx1 = sc.nextDouble();
            System.out.print("Điểm TX2: ");
            double tx2 = sc.nextDouble();
            System.out.print("Điểm KTHP: ");
            double kthp = sc.nextDouble();
            System.out.print("Số tiết nghỉ: ");
            int absent = sc.nextInt(); sc.nextLine();
            students.add(new Student(name, birthYear, address, tx1, tx2, kthp, absent));
            System.out.println("Đã thêm sinh viên.");
        }

        static void editStudent() {
            System.out.print("Nhập tên sinh viên cần sửa: ");
            String name = sc.nextLine();
            for (Student s : students) {
                if (s.getName().equalsIgnoreCase(name)) {
                    System.out.print("Tên mới: ");
                    s.setName(sc.nextLine());
                    System.out.print("Năm sinh mới: ");
                    s.setBirthyear(sc.nextInt()); sc.nextLine();
                    System.out.print("Địa chỉ mới: ");
                    s.setAddress(sc.nextLine());
                    System.out.print("TX1 mới: ");
                    s.setScore_tx1(sc.nextDouble());
                    System.out.print("TX2 mới: ");
                    s.setScore_tx2(sc.nextDouble());
                    System.out.print("KTHP mới: ");
                    s.setScore_KTHP(sc.nextDouble());
                    System.out.print("Số tiết nghỉ mới: ");
                    s.setAbsent_sessions(sc.nextInt()); sc.nextLine();
                    System.out.println("Đã cập nhật thông tin.");
                    return;
                }
            }
            System.out.println("Không tìm thấy sinh viên.");
        }

        static void deleteStudent() {
            System.out.print("Nhập tên sinh viên cần xóa: ");
            String name = sc.nextLine();
            boolean removed = students.removeIf(s -> s.getName().equalsIgnoreCase(name));
            if (removed)
                System.out.println("Đã xóa sinh viên.");
            else
                System.out.println("Không tìm thấy sinh viên.");
        }

    static void showStudents() {
        System.out.printf("%-15s %-10s %-15s %-6s %-6s %-8s %-6s %-6s %-6s\n",
                "Tên", "Năm sinh", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Tuổi", "Nghỉ");
        for (Student s : students)
            System.out.printf("%-15s %-10d %-15s %-6.2f %-6.2f %-8.2f %-6.2f %-6d %-6d\n",
                    s.getName(), s.getBirthyear(), s.getAddress(),
                    s.getScore_tx1(), s.getScore_tx2(), s.getScore_KTHP(),
                    s.getGpa(), s.getAge(), s.getAbsent_sessions());
    }
    }

