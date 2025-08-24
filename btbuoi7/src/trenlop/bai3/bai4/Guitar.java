package trenlop.bai3.bai4;

public class Guitar implements Playable{
    @Override
    public void play(){
        System.out.print("able");
    }
    @Override
    public String toString() {
        return "Guitar ";
    }
}
