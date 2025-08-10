package bai1_trenlop;
import java.util.ArrayList;
public class Cage {
    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetCount;
    private static int totalCages;
    private final int MAX_CAPACITY = 3;
    public Cage(String cageCode){
        this.cageCode = cageCode;
        this.pets = new ArrayList<>();
        this.currentPetCount = 0;
        totalCages++;
    }
    public void addPet(Pet pet){
        if(currentPetCount < MAX_CAPACITY){
            pets.add(pet);
            currentPetCount++;
        }
    }
    public void printAllPets(){
        System.out.println(" Lồng " + cageCode + " có " + currentPetCount + " thú:");
        for(Pet p : pets){
            System.out.println(p.getBasicInfo());
        }
    }
    public static int getTotalCages(){
        return totalCages;
    }
    public ArrayList<Pet> getPets(){
        return pets;
    }
}

