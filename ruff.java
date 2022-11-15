import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Scanner;
//[0,0,0,0,1,1,1]
//[0,1,1,0,0,0,1]
public class ruff {
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0};
        sort(arr);
    }
    static void sort (int [] arr){
        int temp = arr.length-1;
        int start = 0;
        while (start != temp/2){
            while (start<temp/2&&arr[start]==0){
                start++;
            }
            while (temp>0&&arr[temp]==1) {
                temp--;
            }
            int abs = arr[start];
            arr[start] = arr[temp];
            arr[temp] = abs;
        }
        for (int e : arr){
            System.out.print(e + " ");
        }
    }
}
