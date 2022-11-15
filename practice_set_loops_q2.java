import java.util.Scanner;

public class practice_set_loops_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sum of first n even numbers
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int n = 2*a;
        int sum = 0;
        for (int i = 1;i <= n;i++){
            if (i%2==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
