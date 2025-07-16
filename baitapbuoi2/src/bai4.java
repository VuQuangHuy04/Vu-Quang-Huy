import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int maxnum = arr[0];
        for(int i = 0; i < 5; i++){
            sum += arr[i];
            if(maxnum < arr[i]){
                maxnum = arr[i];
            }
        }
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nsum = "+ sum);
        System.out.println("maxnum = "+ maxnum);
    }
}
