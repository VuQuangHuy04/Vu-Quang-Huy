package trenlop.bai3.bai2;

import trenlop.bai1.bai1.Circle;
import trenlop.bai1.bai1.Rectangle;
import trenlop.bai1.bai1.Shape;

public class main {
    public static void main(String[] args) {
        trenlop.bai1.bai1.Shape[] shape = new trenlop.bai1.bai1.Shape[3];
        shape[0] = new trenlop.bai1.bai1.Circle(5);
        shape[1] = new Circle(6);
        shape[2] = new Rectangle(5,4);
        for(Shape s : shape){
            System.out.println(s.toString() +" area = "+s.area());
        }
    }
}
