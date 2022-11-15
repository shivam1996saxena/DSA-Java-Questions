import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_DSA_Sheet_KK {
    public static void main(String[] args) {
                int [] arr ={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr,3)));
            }
    public static int[] shuffle(int[] nums, int n) {
        int j = n;
        for (int i = 1; i <= n-1; i++) {
            if (j< nums.length-1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
        }
        return nums;
    }
            // question Maximum Wealth
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int r = 0;r<accounts.length;r++){
            int temp = 0;
            for (int c = 0;c<accounts[r].length;c++){
                temp += accounts[r][c];
            }
            if (temp>max){
                max = temp;
            }
        }
        return max;
    }
            // question runninngSum
        public static int[] runningSum(int[] nums) {
            int sum = 0;
            for (int i = 0;i<nums.length;i++){
                int temp = nums[i];
                sum = sum + temp;
                nums[i] = sum;
            }
            return nums;
        }
        public static void printArray(int [] arr){
            for (int e:
                    arr) {
                System.out.print(e + " ");
            }
    }
}
