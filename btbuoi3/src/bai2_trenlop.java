import java.util.Scanner;

public class bai2_trenlop {
    static Scanner sc = new Scanner(System.in);
    public static final double PI = 3.14159265;
    public static void main(String[] args){
        double r = sc.nextDouble();
        int k = sc.nextInt();
        System.out.println("chu vi hinh tron" + Math.round(2*PI*r));
        System.out.println("dien tich hinh tron" + Math.round(PI*Math.pow(r,2)));
        System.out.println(r + " mu " + k +" " + (Math.pow(r,k)));
        System.out.println("can bac 2 cua " + (r+k) +" " + (Math.sqrt(r+k)));
        System.out.println("gia tri tuyet doi cua " + (r-k) +" " + (Math.abs(r-k)));
    }
}
