import java.util.Scanner;

public class practice_set_loops_q4 {
    public static void main(String[] args) {
        // Write a program to print the multiplication table in reverse order
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 10;i >= 1;i--){
            int product = n * i;
            System.out.printf("%d X %d = %d" ,n,i,product);
            System.out.println();
        }
    }
}
