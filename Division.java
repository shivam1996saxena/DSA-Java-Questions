import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int q = sc.nextInt();
        if (q>0){
            System.out.println(d/q);
        }
        else System.out.println("-1");

    }
}
