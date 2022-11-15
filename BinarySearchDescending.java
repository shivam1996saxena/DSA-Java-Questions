import java.util.Scanner;

public class BinarySearchDescending {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int [] arr = {1001, 101, 98, 87, 74, 55, 49, 37, 28, 9};
        int find = c.nextInt();
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
           int medium = (start + end)/2;
           if (find==arr[medium]){
               System.out.println("Number Exists");
               return;
           }
           else if (find<arr[medium]){
               start = medium+1;
           }
           else
               end = medium-1;
        }
        System.out.println("Number does not exists");
    }
}
