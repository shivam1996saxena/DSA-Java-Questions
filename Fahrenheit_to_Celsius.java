import java.util.Scanner;
public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // f = fahrenheit
        int f = sc.nextInt();
        // c = celsius
        int c = (f-32)*5/9;
        if ( (f >= (-10^3)) || (f <= (10^3))) {
            System.out.println(c);
        }


    }

}
