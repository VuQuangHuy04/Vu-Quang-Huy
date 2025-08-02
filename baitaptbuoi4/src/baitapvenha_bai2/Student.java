package baitapvenha_bai2;

public class Student {
    private String name;
    private int birthyear;
    private String address;
    private double score_tx1;
    private double score_tx2;
    private double score_KTHP;
    private int absent_sessions;

    public Student(String name, int birthyear, String address, double score_tx1, double score_tx2, double score_KTHP, int absent_sessions) {
        this.name = name;
        this.birthyear = birthyear;
        this.address = address;
        this.score_tx1 = score_tx1;
        this.score_tx2 = score_tx2;
        this.score_KTHP = score_KTHP;
        this.absent_sessions = absent_sessions;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getBirthyear() { return birthyear; }
    public void setBirthyear(int birthyear) { this.birthyear = birthyear; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public double getScore_tx1() { return score_tx1; }
    public void setScore_tx1(double score_tx1) { this.score_tx1 = score_tx1; }

    public double getScore_tx2() { return score_tx2; }
    public void setScore_tx2(double score_tx2) { this.score_tx2 = score_tx2; }

    public double getScore_KTHP() { return score_KTHP; }
    public void setScore_KTHP(double score_KTHP) { this.score_KTHP = score_KTHP; }

    public int getAbsent_sessions() { return absent_sessions; }
    public void setAbsent_sessions(int absent_sessions) { this.absent_sessions = absent_sessions; }

    public int getAge() {
        return 2025 - birthyear;
    }
    public double getGpa() {
        return score_KTHP * 0.6 + score_tx1 * 0.2 + score_tx2 * 0.2;
    }
}