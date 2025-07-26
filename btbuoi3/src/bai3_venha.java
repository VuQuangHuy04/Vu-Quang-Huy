import java.util.Scanner;
public class bai3_venha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)Math.random()*(100) ;
        int b = (int)Math.random()*(100) ;
        int c = (int)Math.random()*(200);
        System.out.println(a + "+" + b +"=" +c);
        String str = sc.nextLine().trim().toLowerCase();
        if((a+b==c && str.equals("dung")) ||  (a + b != c && str.equals("sai")) ){
            System.out.println("ban da tra loi dung");
        }else{
            System.out.println("ban da tra loi sai");
        }
    }
}
