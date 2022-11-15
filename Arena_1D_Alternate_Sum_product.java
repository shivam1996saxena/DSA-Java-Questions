import java.util.Scanner;
// namaste
public class Arena_1D_Alternate_Sum_product {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = c.nextInt();
        }
        int sum = 0;
        int product = 1;
        for (int i=1;i<n;i+=2){
            sum = sum + arr[i];
        }
        for (int i=0;i<n;i+=2){
            product = product * arr[i];
        }
        System.out.println(sum + " " + product);
    }
}
