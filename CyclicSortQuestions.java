import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CyclicSortQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        enterArray(arr);
        //System.out.println(missingNumber(arr));
       // disappearedNums(arr);
       // repeatedNum(arr);
        multipleRepeatedNum(arr);
    }
    // Missing Number in an an 0-N array
    static int missingNumber(int [] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length-1 && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j){
                return j;
            }
        }
        return -1;
    }
    // Find all the numbers disappeared in the array 1-N
    static void disappearedNums(int [] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1){
                System.out.print(j+1);
                System.out.print(" ");
            }
        }
    }
    // find the repeated number in an array 1-N array contain ony one repeated number
    static void repeatedNum(int [] arr){
        int i = 0;
        while (i < arr.length){
            if (arr[i]!=i+1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                }
                else System.out.print(arr[i]);
                return;
            }
            else i++;
        }
    }
    // find the repeated number in an array 1-N array  can contain multiple repeated number
    static void multipleRepeatedNum(int [] arr){
        int i = 0;
        while (i < arr.length){
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                }
            else i++;
        }
        ArrayList<Integer> myArr = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                if (!myArr.contains(arr[j])){
                    myArr.add(arr[j]);
                }
            }
        }
        System.out.print(myArr);
    }

    static void swap(int [] arr, int first, int second){
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
}


