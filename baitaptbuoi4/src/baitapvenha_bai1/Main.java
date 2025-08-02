package baitapvenha_bai1;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("An", 2003, "Hà Nội", 7.5, 8.0, 9.0, 2);
        students[1] = new Student("Bình", 2002, "Đà Nẵng", 6.0, 7.0, 8.0, 1);
        students[2] = new Student("Chi", 2004, "TP.HCM", 9.0, 9.5, 10.0, 0);
        students[3] = new Student("Dũng", 2003, "Hải Phòng", 5.0, 6.5, 7.0, 4);
        students[4] = new Student("Hà", 2002, "Cần Thơ", 8.0, 7.5, 8.5, 3);
        System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s %-12s\n","Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2",
                "Điểm KTHP", "Số tiết nghỉ");
        for(Student s : students){
            System.out.printf("%-12s %-12s %-12s %-12s %-12s %-12s %-12s\n", s.getName(), s.getBirthyear(),s.getAddress(),s.getScore_tx1(),s.getScore_tx2(),s.getScore_KTHP(),s.getAbsent_sessions());
        }
    }
}
