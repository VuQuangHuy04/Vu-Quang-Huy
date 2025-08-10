package bai1_venha;
import java.util.Scanner;
public class Student {
    private String name;
    private String classStudent;
    private double score;
    private Faculty y;
    public Student() {}
    public Student(String name, String classStudent, double score, Faculty y) {
        this.name = name;
        this.classStudent = classStudent;
        this.score = score;
        this.y = y;
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập lớp: ");
        classStudent = sc.nextLine();
        System.out.print("Nhập điểm: ");
        score = sc.nextDouble();
        sc.nextLine();
        y = new Faculty();
        y.Input();
    }
    public void Output() {
        System.out.println("Tên: " + name + ", Lớp: " + classStudent + ", Điểm: " + score);
        y.Output();
    }
    public String getName() {
        return name;
    }
    public String getclassStudent() {
        return classStudent;
    }
    public double getScore() {
        return score;
    }

    public Faculty getY() {
        return y;
    }
}