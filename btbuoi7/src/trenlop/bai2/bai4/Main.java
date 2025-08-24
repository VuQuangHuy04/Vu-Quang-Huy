package trenlop.bai2.bai4;

public class Main {
    public static void main(String[] args) {
        Caculator cacl = new Caculator();
        int kq1 = cacl.sum(1,2);
        double kq2 = cacl.sum(2.5,3.4);
        int kq3 = cacl.sum(1,2,3);
        System.out.println("sum(int, int) = " + kq1);
        System.out.println("sum(double, double) = " + kq2);
        System.out.println("sum(int, int, int) = " + kq3);
    }


}
