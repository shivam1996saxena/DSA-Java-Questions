import java.util.Scanner;

public class Arena_1D_subArrayWithGIvenSum {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int S = c.nextInt();
        int  [] arr = new int [n];
        for(int i = 0;i<n;i++){
            arr[i] = c.nextInt();
        }
        int p=1;
        int q=1;
        boolean sum = false;
        for (int i = 0;i<n;i++){
            p = p+i;
            int total = 0;
            for (int j = i+1;j<n;j++){
                q = j;
                total = total + arr[j];
               if ((arr[i]+total)==S){
                   sum = true;
               }
                   if (sum) {
                       int m = q+1;
                       System.out.println(p + " " + m);
                       break;
               }
            }
            if (sum){
                break;
            }
        }
    }
}
