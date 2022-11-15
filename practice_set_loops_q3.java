import java.util.Scanner;

public class practice_set_loops_q3 {
    public static void main(String[] args) {
        // Write a program to print the multiplication table
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (long i = 1;i <= 10;i++){
            long product = n * i;
            System.out.printf("%d X %d = %d" ,n,i,product);
            System.out.println();
        }

    }
}
