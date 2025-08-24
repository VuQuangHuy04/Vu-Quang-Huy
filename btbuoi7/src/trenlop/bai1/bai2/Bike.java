package trenlop.bai1.bai2;

public class Bike implements Movable{
    private double maxv;

    public Bike(double maxv) {
        this.maxv = maxv;
    }
    @Override
    public void move(){
        System.out.println("xe bike chay voi toc do max "+ maxv);
    }
    public double getMaxv() {
        return maxv;
    }

    public void setMaxv(double maxv) {
        this.maxv = maxv;
    }
}
