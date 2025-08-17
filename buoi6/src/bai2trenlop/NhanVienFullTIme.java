package bai2trenlop;

public class NhanVienFullTIme extends NhanVien{
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTIme(String maNV, String tenSV, int tuoi, String email, String soDienThoai, double luongCoBan, double tienThuong) {
        super(maNV, tenSV, tuoi, email, soDienThoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }
    @Override
    public double tinhLuong(){
        return luongCoBan+tienThuong;
    }

    @Override
    public String toString() {
        return "NhanVienFullTIme{" + super.toString()+
                "tienThuong=" + tienThuong +
                ", luongCoBan=" + luongCoBan +
                '}';
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
}
