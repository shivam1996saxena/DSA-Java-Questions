import java.util.Scanner;

public class Days_Of_A_Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year For Example 2016, 2018 etc");
        int year = sc.nextInt();
        System.out.println("Enter a month For Example 2, 8, 12 etc");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January of " + year + " is of 31 days");
                break;
            case 2: {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("February of " + year + " is of 29 days");
                } else System.out.println("February of " + year + " is of 29 days");
            }
            break;
            case 3:
                System.out.println("March of " + year + " is of 31 days");
                break;
            case 4:
                System.out.println("April of " + year + " is of 30 days");
                break;
            case 5:
                System.out.println("May of " + year + " is of 31 days");
                break;
            case 6:
                System.out.println("June of " + year + " is of 30 days");
                break;
            case 7:
                System.out.println("July of " + year + " is of 31 days");
                break;
            case 8:
                System.out.println("August of " + year + " is of 31 days");
                break;
            case 9:

                System.out.println("September of " + year + " is of 30 days");
                break;
            case 10:
                System.out.println("October of " + year + " is of 30 days");
                break;
            case 11:
                System.out.println("November of " + year + " is of 30 days");
                break;
            case 12:
                System.out.println("December of " + year + " is of 30 days");
                break;
            default:
                System.out.println("Enter a valid month");
                break;
        }
    }

}
