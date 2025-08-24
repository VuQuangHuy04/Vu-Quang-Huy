package trenlop.bai3.bai3;

public class Main {
    public static void main(String[] args) {
        Animal[] list  = new Animal[3];
        list[0]= new Dog();
        list[1]= new Cat();
        list[2]= new Bird();
        for(Animal l : list){
            l.makeSound();
        }
    }
}
