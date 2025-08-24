package trenlop.bai1.bai2;

public class Car implements Movable{
    private double maxv;

    public Car(double maxv) {
        this.maxv = maxv;
    }
    @Override
    public void move(){
        System.out.println("xe Car chay voi toc do max "+ maxv);
    }
    public double getMaxv() {
        return maxv;
    }

    public void setMaxv(double maxv) {
        this.maxv = maxv;
    }
}
