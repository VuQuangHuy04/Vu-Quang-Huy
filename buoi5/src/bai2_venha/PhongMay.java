package bai2_venha;
import  java.util.Scanner;
public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private Double DienTich;
    private QuanLy QL;
    private May[] DSMay;
    private int somay;
    public PhongMay(String MaPhong,String TenPhong,Double DienTich){
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
    }
    public PhongMay(){}
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        MaPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        TenPhong = sc.nextLine();
        System.out.print("Nhập diện tích phòng: ");
        DienTich = sc.nextDouble();
        sc.nextLine();
        QL = new QuanLy();
        System.out.println(" nhap thong tin quan li");
        QL.Nhap();
        System.out.print("Nhap so luong may ");
        somay = sc.nextInt();
        DSMay = new May[somay];
        for(int i = 0; i < somay; i++){
            System.out.println("Nhap thong tin cho may "+ (i+1) + " ");
            DSMay[i] = new May();
            DSMay[i].Nhap();
        }
    }
    public void Xuat(){
        System.out.println("Thong tin phong may");
        System.out.println("Ma phong" + MaPhong + "Ten Phong " + TenPhong + "Dien Tich " + DienTich);
        QL.Xuat();
        System.out.println("Danh sach may ");
        for(int i = 0; i < somay; i++){
            DSMay[i].Xuat();
        }
    }
}
