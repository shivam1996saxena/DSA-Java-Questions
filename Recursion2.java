import java.util.Arrays;
import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char [] arr = str.toCharArray();
//        System.out.println(Arrays.toString(arr));
//       upperCase(str,0);
        System.out.println(product(9,12580));

    }
    static int product (int x,int y){
       if (y==1){
           return x;
       }
       return product(x,y-1)+x;
    }
    static void lengthOfString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = str.length();
        if (i==0){
            return;
        }
        System.out.println(i);
        lengthOfString();
    }
    static void upperCase(String str,int i){
        String temp = str.toUpperCase();
        if (i==str.length()){
            return;
        }
        if (str.charAt(i)==temp.charAt(i)){
            System.out.print(str.charAt(i));
        }
        upperCase(str,i+1);
    }
}

