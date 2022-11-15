import java.util.Scanner;

public class Arena_1D_Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n ; i++)
        {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            int count = 0;
            for (int j = i+1; j < n; j++)
            {
               if (array[j]%array[i]==0)
               {
                   count++;
               }
            }
            System.out.print(count + " ");
        }
    }
}
