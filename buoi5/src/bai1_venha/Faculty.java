package bai1_venha;

import java.util.Scanner;

public class Faculty {
 private String Name;
 private String Date;
 private School x;
    public Faculty(String name, String date, School x){
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }
    public Faculty(){
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten khoa");
        Name = sc.nextLine();
        System.out.println("nhap nam vao khoa");
        Date = sc.nextLine();
        x = new School();
        x.Input();
    }
    public void Output() {
        System.out.println("Khoa: " + Name + ", Năm vào khoa: " + Date);
        x.Output();
    }
    public String getName() {
        return Name;
    }

    public String getDate() {
        return Date;
    }
    public School getX() {
        return x;
    }
}
