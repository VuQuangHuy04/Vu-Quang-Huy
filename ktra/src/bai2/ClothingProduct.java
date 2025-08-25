package bai2;

public class ClothingProduct extends Product{
    @Override
    public double getDiscountPrice(){
        return getPrice()*0.2;
    }
}
