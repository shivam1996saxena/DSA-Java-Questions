import java.util.Scanner;

public class Arena_1D_MaximumSum {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int testCase = c.nextInt();
        while (testCase != 0) {
            int n = c.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = c.nextInt();
            }
            int sum = 0;
            for (int i=0;i<arr.length;i++){
                if (arr[i]<0){
                    continue;
                }
                else sum = sum + arr[i];
            }
            System.out.println(sum);
            testCase--;
        }
    }
}
