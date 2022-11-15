import java.util.Scanner;

public class Arena_1D_Array_Rotation {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int testcase = c.nextInt();
        while (testcase!=0){
            int n = c.nextInt();
            int d = c.nextInt();
            int [] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i] = c.nextInt();
            }
            for (int i=0;i<d;i++){
                int temp = arr[i];
                arr[i] = temp + d;
                temp = 0;
            }
            for (int i=d;i<arr.length;i++){
                int temp = arr[i];
                arr [i] = temp-d;
                temp = 0;
            }
           for (int i=0;i<n;i++){
               System.out.print(arr[i] + " ");
           }
            testcase--;
        }
    }
}
