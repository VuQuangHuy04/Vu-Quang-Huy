package bai2;

public class ElectronicProduct extends Product{
    @Override
    public double getDiscountPrice(){
        return getPrice()*0.1;
    }
}
