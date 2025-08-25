package bai2;

public class FoodProduct extends Product{
    @Override
    public double getDiscountPrice(){
        return getPrice()*0.025;
    }
}
