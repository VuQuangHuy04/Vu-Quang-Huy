package trenlop.bai1.bai1;

public class Circle extends Shape{
    final static double pi = 3.14;
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public double area(){
        return r*pi;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
}
