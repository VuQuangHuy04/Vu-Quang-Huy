package bai1_venha;
import java.util.Scanner;
public class School {
    private String Name;
    private String Date;
    public School(String name, String date){
        this.Name = Name;
        this.Date = Date;
    }
    public School(){

    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten truong");
        Name = sc.nextLine();
        System.out.println("nhap nam vao truong");
        Date = sc.nextLine();
    }
    public String getName(){
        return Name;
    }
    public String getDate(){
        return Date;
    }
    public void Output(){
        System.out.println("Khoa: " + Name + ", Năm vào khoa: " + Date);
    }
}
