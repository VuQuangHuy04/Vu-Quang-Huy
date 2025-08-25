package bai2;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class ProductServiceImpl implements ProductService{
    private ArrayList<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    @Override
    public void addProduct(Product p){
        products.add(p);
    }
    @Override
    public void updateProduct(String id,Product newInfo){
        newInfo.setId(sc.nextLine());
        newInfo.setName(sc.nextLine());
        sc.nextLine();
        newInfo.setPrice(sc.nextDouble());
        newInfo.setCategory(sc.nextLine());
    }
    @Override
    public void deleteProduct(String id){
        for(Product s : products){
            if(s.getId().equals(id)){
                products.remove(s);
            }
        }
    }
    @Override
    public void findByName(String name){
        for(Product s : products){
            if(s.getName().equals(name)){
                System.out.println("found");
            }
        }}
    public void sortByPriceAsc(){
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }
    public void sortByPriceDesc(){
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}

