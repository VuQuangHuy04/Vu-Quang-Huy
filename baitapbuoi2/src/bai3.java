import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("a + b = %d\na - b = %d\na * b = %d\n",a+b,a-b,a*b);
        if(b!= 0){
            System.out.println("a / b = " + ((double)a / b));
            System.out.println("a % b = " + (a % b));
        }
        if (a == b) {
            System.out.println("Hai số bằng nhau.");
        } else {
            System.out.println("Hai số KHÔNG bằng nhau.");
        }
    }
}
