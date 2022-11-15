import java.util.Scanner;

public class Arena_1D_K_Circle_Sum {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int[] arr = new int[n];
        int k = c.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = c.nextInt();
        }
        int sum = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i;  j < k + i; j++) {
//                if (j == n) {
//                    for (int x = 0; x < k - a; x++) {
//                        sum = sum + arr[x];
//                    }
//                    break;
//                }
                sum = sum + arr[j%n];
                a++;
            }
            System.out.print(sum + " ");
            sum = 0;
            a = 0;
        }
    }
}