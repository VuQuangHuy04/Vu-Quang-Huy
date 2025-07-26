import java.util.Scanner;
public class bai5_trenlop {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
       int n = sc.nextInt();
       int[][] arr = new int[n][n];
       int index = 1;
       int top = 0, bottom = n-1;
       int left = 0, right = n - 1;
       while(index <= n*n){
           for(int i = left; i <= right; i++){
               arr[top][i] = index++;
           } top++;
           for(int i = top; i <= bottom; i++){
               arr[i][right] = index++;
           } right--;
           for(int i = right; i >= left; i--){
               arr[bottom][i] = index++;
           } bottom--;
           for(int i = bottom; i >= top; i--){
               arr[i][left] = index++;
           } left++;
       }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            sum += arr[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            sum -= arr[n / 2][n / 2];
        }
        System.out.println("Tong 2 duong cheo: " + sum);

    }
}
