import java.util.Scanner;

public class diceProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        int i = 0;
        while (T != 0) {
            T--;
            int n = sc.nextInt();
            arr[i] = n;
            i++;

        }
        for (int element : arr) {
            if (element == 1) {
                System.out.print("6" + " ");
            } else if (element == 2) {
                System.out.print("5" + " ");
            } else if (element == 3) {
                System.out.print("4" + " ");
            } else if (element == 4) {
                System.out.print("3" + " ");
            } else if (element == 5) {
                System.out.print("2" + " ");
            } else if (element == 6) {
                System.out.print("1" + " ");
            }
        }
    }
}
