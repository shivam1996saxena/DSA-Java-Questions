import java.util.Arrays;
import java.util.Scanner;

public class Arena_1D_maxAndmin {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int testCase = c.nextInt();
        while (testCase != 0) {
            int n = c.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = c.nextInt();
            }
            Arrays.sort(arr);
            System.out.print(arr[n-1] + " " + arr[0]);
            System.out.println();
            testCase--;
        }
    }
}
