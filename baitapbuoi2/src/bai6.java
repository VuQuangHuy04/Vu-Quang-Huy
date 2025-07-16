import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] name = new String[n];
        int[] age = new int[n];
        double[] gpa = new double[n];
        double gpaclass = 0;
        for (int i = 0; i < n; i++) {
            name[i] = sc.nextLine();
            age[i] = sc.nextInt();
            gpa[i] = sc.nextDouble();
            sc.nextLine();
        }
        double maxgpa = gpa[0];
        System.out.print("ten sv: ");
        for (int i = 0; i < n; i++) {
            System.out.print(name[i] + ", ");
            gpaclass += gpa[i];
            if(maxgpa < gpa[i]){
                maxgpa = gpa[i];
            }
        }
        System.out.printf("\ngpa ca lop %.1f\n",(gpaclass/n));
        System.out.println("sv co diem cao nhat la " + maxgpa);
        }
    }

