import java.util.Scanner;

public class arena_1Darray_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase != 0) {
            int n = sc.nextInt();
            int lastNumber = sc.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            arr[n] = lastNumber;
            for (int element : arr) {
                System.out.print(element + " ");
            }
            testcase--;
            System.out.println();
        }
    }
}