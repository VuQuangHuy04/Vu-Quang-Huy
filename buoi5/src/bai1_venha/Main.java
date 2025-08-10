package bai1_venha;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập số sinh viên: ");
    int n = sc.nextInt();
    sc.nextLine();
    Student[] students = new Student[n];
    for(int i = 0; i<n;i++) {
        System.out.println(" Nhập thông tin sinh viên thứ " + (i + 1) + " ");
        students[i] = new Student();
        students[i].Input();
    }
        System.out.println("\n DANH SÁCH SINH VIÊN");
        for(int i = 0; i<n;i++)
    {
        students[i].Output();
        System.out.println();
    }
}
}
