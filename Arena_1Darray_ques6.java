import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Arena_1Darray_ques6 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int [] arr = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i] = c.nextInt();
        }
        Arrays.sort(arr);
        int currentCount = 0;
        int maxCount = 1;
        int element = 0;
        for (int i=0;i<arr.length;i++){
            int temp = i;
            for(int j = 1;j< arr.length;j++){
                if (arr[temp]==arr[j]){
                    currentCount++;
                }
                else currentCount = 1;
                if (currentCount>maxCount){
                    maxCount = currentCount;
                    element = arr[j-1];
                }
            }
        }
        System.out.println("The element with most frequency within Array is : - ");
        System.out.print(element);
    }
}