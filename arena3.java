import java.util.Scanner;
public class arena3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int area = s*s;
        if (s >= 1 || s <= 100) {
            System.out.print(area);
        } else System.out.print("invalid");
    }
}

