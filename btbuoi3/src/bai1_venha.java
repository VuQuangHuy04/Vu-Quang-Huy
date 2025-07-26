import java.util.Scanner;

public class bai1_venha {
    // Các hằng số loại hình
    public static final String SQUARE = "SQUARE";
    public static final String TRIANGLE = "TRIANGLE";
    public static final String CIRCLE = "CIRCLE";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai hinh (SQUARE, TRIANGLE, CIRCLE): ");
        String type = sc.nextLine().toUpperCase().trim(); // viết hoa, loại bỏ khoảng trắng
        double area = 0;
        switch (type) {
            case SQUARE:
                System.out.print("Nhap canh cua hinh vuong: ");
                double side = sc.nextDouble();
                area = side * side;
                break;
            case TRIANGLE:
                System.out.print("Nhap day: ");
                double base = sc.nextDouble();
                System.out.print("Nhap chieu cao: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                break;
            case CIRCLE:
                System.out.print("Nhap ban kinh: ");
                double radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                break;
            default:
                System.out.println("Hinh dang khong hop le!");
                return;
        }
        System.out.printf("Dien tich cua vien gach hinh %s la: %.2f\n", type, area);
    }
}
