import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int j = 2;
        int [] series = new int [N];
        series[0] = N;
        sum = series[0];
        for (int i = 1; i < N; i++) {
            series[i] = (series[i-1]*j)-1;
            sum += series[i];
        }
        System.out.print(sum);
    }
}
