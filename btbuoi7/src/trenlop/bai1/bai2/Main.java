package trenlop.bai1.bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movable> list = new ArrayList<>();
        list.add(new Car(3));
        list.add(new Bike(5));
        for(Movable l : list){
            l.move();
        }
    }
}
