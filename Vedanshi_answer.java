import java.util.Scanner;

public class Vedanshi_answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year%400==0)||(year%4==0 && year%100 != 0)){
    System.out.print("This is a leap year");}
       else  {
                System.out.println("not a leap year");

            }
        }

    }

