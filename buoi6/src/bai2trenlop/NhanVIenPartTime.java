package bai2trenlop;

public class NhanVIenPartTime extends NhanVien {
    private int soGioLam;
    private double luongTheoGio;

    public NhanVIenPartTime(String maNV, String tenSV, int tuoi, String email, String soDienThoai, int soGioLam, double luongTheoGio) {
        super(maNV, tenSV, tuoi, email, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }
    @Override
    public double tinhLuong(){
        return soGioLam*luongTheoGio;
    }
    @Override
    public String toString() {
        return "NhanVIenPartTime{" + super.toString() +
                "soGioLam=" + soGioLam +
                ", luongTheoGio=" + luongTheoGio +
                '}';
    }
    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double getLuongTheoGio() {
        return luongTheoGio;
    }

    public void setLuongTheoGio(double luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }
}
