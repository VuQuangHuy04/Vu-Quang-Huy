import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String clas = sc.nextLine();
        float gpa = sc.nextFloat();
        System.out.println("Nhap ten,tuoi,lop,gpa cua ban");
        System.out.println("Tên:" + name +"- Tuổi: " + age +"- Lớp: " + clas + "- GPA: " +gpa);
    }
}
