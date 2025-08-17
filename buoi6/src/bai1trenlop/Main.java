package bai1trenlop;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> arraylist = new ArrayList<>();

        arraylist.add(new SinhVien("2222","huy",3.0,"ktpm4","a"));
        arraylist.add(new SinhVien("2223","huyuu",4.0,"ktpm4","a"));
                for(int i = 0; i < 2; i++){
                    arraylist.get(i).Inthongtin();
                }
                double maxscore = arraylist.get(0).getDiemTB();
         for(SinhVien sv : arraylist){
             if(sv.getDiemTB() > maxscore){
                 maxscore = sv.getDiemTB();
             }
         }
        System.out.println("diem tb cao nhat la " + maxscore);
    }
}