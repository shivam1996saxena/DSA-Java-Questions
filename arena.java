import java;
public class arena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = sc.nextLong();
        float c = sc.nextFloat();
        double d = sc.nextDouble();
        char e = sc.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.print("%.2f",c);
        System.out.println();
        System.out.print("%.4",d);
        System.out.println();
        System.out.println(e);

    }
