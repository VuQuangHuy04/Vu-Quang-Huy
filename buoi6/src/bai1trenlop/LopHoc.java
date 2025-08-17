package bai1trenlop;

public class LopHoc {
    private String MaLop;
    private String TenLop;
    public LopHoc(String MaLop, String TenLop){
        this.MaLop= MaLop;
        this.TenLop = TenLop;
    }
    public void InThongTin(){
        System.out.println("Ma lop :" + this.MaLop + " Ten lop: "+ this.TenLop);
    }
    public void setMaLop(String maLop) {
        MaLop = maLop;
    }
    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }
    public String getMaLop() {
        return MaLop;
    }
    public String getTenLop() {
        return TenLop;
    }
}
