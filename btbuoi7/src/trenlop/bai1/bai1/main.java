package trenlop.bai1.bai1;

public class main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(5);
        shape[1] = new Circle(6);
        shape[2] = new Rectangle(5,4);
        for(Shape s : shape){
            System.out.println(s.toString() +" area = "+s.area());
        }
    }
}
