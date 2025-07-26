import java.util.Scanner;

public class bai4_trenlop {
    public static int fibonaci(int n){
        if(n<=1) return n;
        return fibonaci(n-1) + fibonaci(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int count = 0;
        for(int i = 0; i < n; i++){
             int check = fibonaci(i);
             System.out.print(check + " ");
             if(check %2 != 0){
                 count+= check;
             }
         }
        System.out.print( "tong fibonaci le"+count);
    }
}
