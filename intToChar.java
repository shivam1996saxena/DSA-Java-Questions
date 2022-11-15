import java.util.ArrayList;
import java.util.Scanner;

public class intToChar {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 97; i <= 122; i++) {
            System.out.print((char)(i));
            System.out.print("="+a+",");
            a++;
        }
        System.out.println();
        System.out.println("Enter your integers as per the keyword assigned to the character/0 to stop input");
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want output in UPPERCASE press 1 else press 0");
        int casee = sc.nextInt();
        int input = sc.nextInt();
        ar.add(input);
        while (input!=0){
            input = sc.nextInt();
            ar.add(input);
        }
        int l = ar.size()-1;
        if (casee==0) {
            for (int i = 0; i < l; i++) {
                System.out.print((char) (ar.get(i) + 96));
            }
        }
        if (casee==1){
            for (int i = 0; i < l; i++) {
                System.out.print((char) (ar.get(i) + 64));
            }
        }
    }
}
