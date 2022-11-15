import java.util.Scanner;

public class arena_1D_Negative_integer {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int [] array = new int[n];
       boolean containsNegative = false;
        for (int i = 0;i<n;i++){
            array[i] = c.nextInt();
        }
        for (int i =0;i<n;i++){
            if (array[i]<0){
                containsNegative = true;
            }
        }
        if (containsNegative){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
