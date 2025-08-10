package bai1_trenlop;

public class Pet {
    private String name;
    private double weight;
    private String species;
    public Pet(String name, double weight, String species){
        this.name = name;
        this.weight = weight;
        this.species = species;
    }
    public void printInfo(){
       System.out.println("name :" + name);
        System.out.println("species :" + species);
        System.out.println("weight :" + weight);
    }
    public boolean isOverweight(){
        if(weight > 10){
            return true;
        }else{
            return false;
        }
    }
    public String getBasicInfo(){
        return name + "_" + species + "_"+ weight ;
    }
    public double getWeight() {
        return weight;
    }
}
