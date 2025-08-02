package baitaptrenlop_bai1;

import java.util.Scanner;
import java.util.Scanner;
public class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("Xin chào, tôi tên là " + name + ", năm nay " + age + " tuổi");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(sc.nextLine(),sc.nextInt());
        student.sayHello();
    }
}
