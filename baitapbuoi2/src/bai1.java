import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        float height = sc.nextFloat();
        System.out.println("Xin chao " + name + "ban " + age + "tuoi va cao " + height + "mét.");
    }
}