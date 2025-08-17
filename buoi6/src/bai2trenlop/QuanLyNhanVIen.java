package bai2trenlop;

import java.util.ArrayList;

public class QuanLyNhanVIen {
    private ArrayList<NhanVien> danhSachSinhVien = new ArrayList<>();
    public QuanLyNhanVIen(ArrayList<NhanVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }
    public QuanLyNhanVIen(){}
    public void themNhanVien(NhanVien nv){
        danhSachSinhVien.add(nv);
    }
    public void hienThiTatCa(){
        for(NhanVien nv : danhSachSinhVien){
            System.out.println(nv);
        }
    }
    public double tinhTongLuong(){
        double tong = 0;
        for(NhanVien nv : danhSachSinhVien){
            tong += nv.tinhLuong();
        }
        return tong;
    }

    public ArrayList<NhanVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void setDanhSachSinhVien(ArrayList<NhanVien> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }
}
