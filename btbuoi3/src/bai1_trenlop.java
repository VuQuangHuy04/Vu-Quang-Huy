import java.util.Scanner;
public class bai1_trenlop {
    static Scanner sc = new Scanner(System.in);
    public static void getinput(int n, int arr[]){
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void chanle(int n, int arr[]){
        int chan = 0;
        int le = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]%2 == 0){
                chan+= arr[i];
            }else{
                le+=arr[i];
            }
        }
        System.out.println("tong so chan la "+ chan);
        System.out.println("tong so le la "+ le);
    }
    public static boolean check(int n){
        if(n < 2) return false;
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void snt(int n, int arr[]){
        for(int i = 0; i < n; i++){
            if(check(arr[i])){
                System.out.print(arr[i] + "");
            }
        }
    }
    public static void main(String[] args){
      int n = sc.nextInt();
      int[] arr = new int[100001];
      getinput(n, arr);
      chanle(n, arr);
      snt(n, arr);
    }
}
