package venha.bai1;
import java.util.Scanner;


public class main {
    public static void solve(String s){
    int vowels_int = 0;
    int upper_int = 0;
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        char d = Character.toLowerCase(c);
        if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {
            vowels_int++;
        }
        if(Character.isUpperCase(c)){
            upper_int++;
        }

    }
    System.out.println("so nguyen am la : "+ vowels_int);
    System.out.println("so ki tu viet hoa la: " + upper_int);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi ");
        String s = sc.nextLine();
        solve(s);
    }
}
