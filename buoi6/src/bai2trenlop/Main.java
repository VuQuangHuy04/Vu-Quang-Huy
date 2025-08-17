package bai2trenlop;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVIen ql = new QuanLyNhanVIen();
        NhanVien nv1 = new NhanVienFullTIme("FT01", "Huy", 25, "huy@gmail.com", "0123456789", 10000000, 2000000);
        NhanVien nv2 = new NhanVienFullTIme("FT02", "Minh", 30, "minh@gmail.com", "0987654321", 12000000, 3000000);
        NhanVien nv3 = new NhanVIenPartTime("PT01", "Lan", 20, "lan@gmail.com", "0111111111", 40, 50000);
        NhanVien nv4 = new NhanVIenPartTime("PT02", "An", 22, "an@gmail.com", "0222222222", 30, 60000);
        ql.themNhanVien(nv1);
        ql.themNhanVien(nv2);
        ql.themNhanVien(nv3);
        ql.themNhanVien(nv4);
        System.out.println("thong tin nv ");
        ql.hienThiTatCa();
        System.out.println("tong quy luong = " + ql.tinhTongLuong());
    }
}
