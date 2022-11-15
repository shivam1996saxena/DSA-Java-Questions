import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((b>=1)&&(b<=a)&&(a<=1000)&&((a%b)==0))
        {
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
        }

    }
}
