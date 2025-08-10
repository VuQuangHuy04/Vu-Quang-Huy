package bai1_trenlop;

public class Main {
    public static void main(String[] args) {
        Cage cage1 = new Cage("001");
        Cage cage2 = new Cage("002");
        cage1.addPet(new Pet("meo muop",4.6,"meo"));
        cage1.addPet(new Pet("cho co", 5.4,"cho"));
        cage2.addPet(new Pet("cho soi", 10,"cho" ));
        cage2.addPet(new Pet("ga trong",13.0,"ga"));
        System.out.println("so long tao ra : " + Cage.getTotalCages());
        cage1.printAllPets();
        cage2.printAllPets();
        System.out.println("\n Danh sách thú nặng hơn 10kg:");
        for(Pet p : cage1.getPets()){
            if(p.isOverweight()){
                p.printInfo();
            }
        }
        for(Pet p: cage2.getPets()){
            if(p.isOverweight()){
                p.printInfo();
            }
        }
    }
}
