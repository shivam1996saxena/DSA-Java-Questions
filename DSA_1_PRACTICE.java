import java.util.Scanner;

public class DSA_1_PRACTICE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = input_Array(size);
        print_Array(array);

    }

    static int [] input_Array(int size){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr [i] = sc.nextInt();
        }
        return arr;
    }
    static void print_Array (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void twoSum (int [] arr, int target){



    }
}