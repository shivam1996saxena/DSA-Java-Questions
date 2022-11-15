import java.util.Objects;
import java.util.Scanner;

public class Arena_1D_seasonOfLove {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        String  [] arr = new String[n];
        arr[0] = "w";
        int count = 0;
        for (int i = 1;i<n;i++){
            if (Objects.equals(arr[i - 1], "w")){
                arr[i] = "y";
                count++;
            }
            if (Objects.equals(arr[i - 1], "y")){
                arr[i] = "r";
            }
            if (Objects.equals(arr[i - 1], "r")){
                arr[i] = "w";
            }
        }
        System.out.println(count);
    }
}
