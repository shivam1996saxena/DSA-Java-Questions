import java.util.Arrays;
import java.util.Scanner;

public class kk_array_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 6;
        int [] nums = {1,2,1};
        int [] ans = new int [2*(nums.length)];
        int a = 0;
        for (int i = 0; i < ans.length; i++) {
            if (a> nums.length-1){
                a = 0;
            }
            ans [i] = nums[a];
            a++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
