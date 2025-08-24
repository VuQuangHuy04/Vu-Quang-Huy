package trenlop.bai1.bai4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = 0,b = 0 ,c;
        boolean isvalid = false;
        while(!isvalid){
            try{
                System.out.print("Nhập số nguyên a: ");
                a = sc.nextInt();
                isvalid = true;
                break;
            }catch(InputMismatchException e){
                System.out.println("Dữ liệu không hợp lệ! Vui lòng nhập số nguyên.");
                sc.nextLine();
            }
        }
        isvalid = false;
        while(!isvalid){
            try{
                System.out.print("Nhập số nguyên b: ");
                b = sc.nextInt();
                isvalid = true;
                break;
            }catch(InputMismatchException e){
                System.out.println("Dữ liệu không hợp lệ! Vui lòng nhập số nguyên.");
                sc.nextLine();
            }
        }
        try{
            c = a / b;
            System.out.println("a/b = " + c);
        }catch(ArithmeticException e){
            System.out.println("không chia được cho 0");
        }
    }
}
