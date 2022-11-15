import java.util.Scanner;

public class Arena_1D_Best_Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n ; i++)
        {
            array[i] = scanner.nextInt();
        }
        int sumOfSequence = 0;
        for (int i = 0; i < n; i++)
        {
            sumOfSequence += array[i];
        }
        int a = 0;
        int b = n-1;
         while (sumOfSequence%10==0&&b>0&&a<n)
            {
                if(a<b){
                    sumOfSequence = sumOfSequence - array[a];
                }
                if (b<a){
                    sumOfSequence = sumOfSequence - array[b];
                }
                a++;
                b--;
            }
         if (sumOfSequence%10==0)
         {
             sumOfSequence = 0;
         }
        System.out.println(sumOfSequence);
    }
}
