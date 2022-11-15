import java.util.Scanner;

public class arena_control_positivenegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            System.out.println("Positive");
        }
        if (n<0){
            System.out.println("Negative");
        }
        if (n==0){
            System.out.println("Zero");
        }
    }
}
