package baitaptrenlop_bai3;
import java.util.Scanner;
public class car {
    String brand;
    int maxspeed;
    public car(String brand, int maxspeed){
        this.brand = brand;
        this.maxspeed = maxspeed;
    }
    public void run(){
        System.out.println("xe " + brand + " chay voi toc do max "+ maxspeed + " km/h ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car mec = new car(sc.nextLine(),sc.nextInt());
        mec.run();
    }
}