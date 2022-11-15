import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class bitCalculator {
    public void bitToInteger(){
        int result = 0;
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        String N = Integer.toString(n);
        int l = N.length();
        int bit = n;
        while (bit!=0){
            for (int i = 0;i<l;i++){
                int mod = bit % 10;
                bit = bit/10;
                int a = 2;
                int function = (int) ((Math.pow(a,i))*mod);
                result = function + result;
            }
        }

        System.out.print("The Integer form of Binary "+n+" is : "+result);
    }
    public void intToBit () {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int number = n;
        int size = 0;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        while (number != 0) {
            int mod = number % 2;
            number = number / 2;
            temp.add(size, mod);
            size++;
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            result.add(temp.get(i));
        }
        System.out.print("The Binary form of " + n + " is : ");
        for (int e : result) {
            System.out.print(e);
        }
    }
}
class driver{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.format("Press %d for Binary Calculator or Press %d to Exit",1,0);
        System.out.println();
        int input = sc.nextInt();
        if (input==1){
            bitCalculator obj = new bitCalculator();
            System.out.format("Press %d to convert Integer to Binary\nPress %d to convert Binary to Integer\n",1,2);
            int a = sc.nextInt();
            if (a==1){
                System.out.println("Enter your Integer");
                obj.intToBit();
                System.out.println();
            } else if (a==2) {
                System.out.println("Enter your Binary code");
                obj.bitToInteger();
                System.out.println();
            }
            else System.out.println("Invalid Entry");
        }
    }
}