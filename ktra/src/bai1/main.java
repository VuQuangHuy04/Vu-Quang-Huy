package bai1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String s;int count = 0;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String check = " ";
        String reversed="";
        String tame = "";
        for(int i = 0; i < s.length(); i++){
            String t = "";
            t += s.charAt(i);
            tame += s.charAt(i);
            if(check.equals(t)){
                count++;
            }
        }
        System.out.println("so khoang trang la "+ count);
        for(int i = s.length()-1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        System.out.println("so ki tu khoang trang la "+ reversed);
    }
}
