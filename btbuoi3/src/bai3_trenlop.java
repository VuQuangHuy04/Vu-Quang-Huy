import java.util.Scanner;
public class bai3_trenlop {
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
            System.out.println("chuoi doi xung");
        }else{
            System.out.println("chuoi khong doi xung");
        }
    }
}
