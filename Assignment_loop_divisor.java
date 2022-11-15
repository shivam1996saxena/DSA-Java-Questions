import java.util.Scanner;

public class Assignment_loop_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int k = sc.nextInt();
        int counter = 0;
        int i = input;
        boolean Rare_number = false;
        while (i != 0)
        {
            i  =  i / 10;
            counter = counter + 1;
        }
        for (int j = counter; j>=1; j--)
        {
            int m = input % 10;
            input= input / 10;
            if (m%k==0)
            {
                Rare_number = true;
            }
            else {
                Rare_number = false;
                break;
            }
        }
        if (Rare_number){
            System.out.println(1);
        }
        else System.out.println(0);
    }
}
