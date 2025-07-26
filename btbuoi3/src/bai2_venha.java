import java.util.Locale;
import java.util.Scanner;
public class bai2_venha {
    public static void main(String[] args ){
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        String str_2 = "";
        str = str.trim();
        for(int i = str.length()-1; i >= 0 ; i++){
            str_2 += str.charAt(i);
        }
        boolean check = str.equalsIgnoreCase(str_2);
        if(check){
            String str3 = str_2.toUpperCase();
            System.out.println("chuoi doi xung" + str3);
        }else{
            String str4 = str_2.toLowerCase();
            System.out.println("chuoi khong doi xung" + str4);
        }
    }
}
