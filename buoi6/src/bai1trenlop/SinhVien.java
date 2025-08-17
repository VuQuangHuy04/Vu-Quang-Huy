package bai1trenlop;

public class SinhVien {
    private String maSV;
    private String name;
    private Double diemTB;
    private LopHoc lop;
    public SinhVien( String maSV, String name, Double diemTB, String MaLop, String TenLop){
        this.maSV = maSV;
        this.name = name;
        this.diemTB = diemTB;
        this.lop = new LopHoc(MaLop,TenLop);
    }
    public void Inthongtin(){
        System.out.println("name: " + this.name + " masv: "+ this.maSV+" diemtb: "+this.diemTB );
        lop.InThongTin();
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(Double diemTB) {
        this.diemTB = diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }
}
