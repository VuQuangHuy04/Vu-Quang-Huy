package bai2trenlop;

public class NhanVien {
    private String maNV;
    private String tenSV;
    private int tuoi;
    private String email;
    private String soDienThoai;

    public NhanVien(String maNV, String tenSV, int tuoi, String email, String soDienThoai) {
        this.maNV = maNV;
        this.tenSV = tenSV;
        this.tuoi = tuoi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }
    public double tinhLuong(){
        return 0;
    }
    @Override
    public String toString() {
        return "NhanVien{" +
                "soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", tuoi=" + tuoi +
                ", tenSV='" + tenSV + '\'' +
                ", maNV='" + maNV + '\'' +
                '}';
    }
    public String getMaNV() {
        return maNV;
    }
    public String getTenSV() {
        return tenSV;
    }
    public int getTuoi() {
        return tuoi;
    }
    public String getEmail() {
        return email;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
}
