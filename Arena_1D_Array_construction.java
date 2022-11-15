import java.util.Arrays;
import java.util.Scanner;

public class Arena_1D_Array_construction {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int [] value = new int[n];
        for (int i=0;i<n;i++){
            value [i] = c.nextInt();
        }
        int [] frequency = new int[n];
        for (int i=0;i<n;i++){
            frequency [i] = c.nextInt();
        }
        int k = c.nextInt();
        int sum = 0;
        for (int i=0;i<n;i++){
            sum = sum + frequency[i];
        }
        int a = 0;
        int [] constructedArray = new int[sum];
        for (int i=0;i<n;i++) {
            for (int j = 1; j <= frequency[i]; j++) {
                   constructedArray[a] = value[i];
                   a++;
                }
            }
        Arrays.sort(constructedArray);
        System.out.print(constructedArray[k-1]);
    }
}