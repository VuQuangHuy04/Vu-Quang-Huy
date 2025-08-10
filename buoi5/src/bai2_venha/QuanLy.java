package bai2_venha;
import java.util.Scanner;
public class QuanLy {
    private String MaQL;
    private String HoTen;
    public QuanLy(String MaQL, String HoTen){
        this.MaQL = MaQL;
        this.HoTen = HoTen;
    }
    public QuanLy(){};
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma quan li ");
        MaQL = sc.nextLine();
        System.out.println("nhap ho ten ");
        HoTen = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("MaQL " + MaQL + "Ho Ten"+HoTen);
    }

    public String getMaQL() {
        return MaQL;
    }
    public String getHoTen(){
        return HoTen;
    }
}
