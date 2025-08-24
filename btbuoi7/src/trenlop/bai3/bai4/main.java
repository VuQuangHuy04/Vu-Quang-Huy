package trenlop.bai3.bai4;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Playable> list = new ArrayList<>();
        list.add(new Guitar());
        list.add(new Piano());
        for(Playable l : list){
            System.out.print(l.toString() + ": ");
            l.play();
            System.out.print("\n");
        }
    }


}
