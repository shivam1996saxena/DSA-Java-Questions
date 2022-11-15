import java.util.Scanner;

public class numberWithDigitD_arenaLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        for (int i = 1;i <= n;i++){
            int temp = i;
            if (i>=10) {
                while (temp != 0) {
                    int k = temp % 10;
                    temp = temp / 10;
                    if (k == d) {
                        System.out.print(i + " ");
                        continue;
                    }
                }
            }
            if (i==d){
                System.out.print(i + " ");
            }
        }
    }
}
