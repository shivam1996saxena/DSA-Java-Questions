import java.util.Arrays;
import java.util.Scanner;

public class Viraaj_sort_methods {
    public static void main(String[] args) {
      int [] arr = {5,4,4,2,1};
//      bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        insertionSort(arr);

    }

    public static void bubbleSort(int[]arr){
        // run the steps n-1 times // n = length of array
        for (int i = 0; i < arr.length; i++) {
            // for each step, max element will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[]arr){
        // 1 4 3 2 5
        for (int i = 0; i < arr.length; i++) {
            // find the maximum element in the remaining array and swap it with its correct index
        int last = arr.length-1-i;
        int maxIndex = getMaxIndex(arr,0,last);
        swap(arr,maxIndex,last);
        }
    }
    // 10 9 3 7 6 2 4 - i - 3
    // j 1 - 9 10 3 7 6 2 4
    // j 10 3 9 7 6 2 4  - 3 9 10 7 6 2 4
    // 3 9 7 10 6 2 4 - 3 7 9 10 6 2 4
    // 3 7 9 6 10 2 4 - 3 7 6 9 10 2 4 - 3 6 7 9 10 2 4

    static void insertionSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
    }
    static int getMaxIndex(int [] arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int [] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void enterArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static void cyclicSort(int [] arr){
        // 1 2 3 4 5
        int i = 0; // for maintaining index
        while (i < arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
    }
}
