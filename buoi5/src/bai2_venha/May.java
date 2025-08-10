package bai2_venha;

import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;
    public May(String MaMay,String TenMay,String TinhTrang ){
        this.MaMay=MaMay;
        this.TenMay = TenMay;
        this.TinhTrang = TinhTrang;
    }
    public May(){}
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma may ");
        MaMay = sc.nextLine();
        System.out.println("nhap ten may ");
        TenMay = sc.nextLine();
        System.out.println("nhap tinh trang ");
        TinhTrang = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma May " + MaMay + " Ten May "+TenMay + " Tinh Trang " + TinhTrang);
    }
    public String getMaMay() {
        return MaMay;
    }
    public String getTenMay() {
        return TenMay;
    }
    public String getTinhTrang() {
        return TinhTrang;
    }
}
