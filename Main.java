import  java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            long b = sc.nextLong();
            float c = sc.nextFloat();
            double d = sc.nextDouble();
            char e = sc.next().charAt(0);
            System.out.println(a);
            System.out.println(b);
            System.out.printf("%.2f",c);
            System.out.println();
            System.out.printf("%.4f",d);
            System.out.println();
            System.out.println(e);
        }
}