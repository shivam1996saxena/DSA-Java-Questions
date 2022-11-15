import java.util.Scanner;
class Speed_Distance_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Time, Distance, Speed calculator");
        System.out.println("Press 1 for Speed/Press 2 for Time/ Press 3 for Distance");
        int a = sc.nextInt();
        if (a==1){
            System.out.println("Enter your Distance (in Kms)");
            float distance = sc.nextFloat();
            System.out.println("Enter your Time (in Hrs)");
            float time = sc.nextFloat();
            float speed = distance/time;
            System.out.println("Your Average Speed is "+ speed+"km/hr");
            System.out.println("For Miles/Hr Press 1 else Press 0 ");
            float Speed2 = sc.nextFloat();
            if (Speed2==1){
                System.out.println(speed*0.62137f + " Miles/Hr");
            }
            else System.out.println("Thank you");

        }
        else if (a==2) {
            System.out.println("Enter your Distance (in Kms)");
            float distance = sc.nextFloat();
            System.out.println("Enter your Speed (in Km/Hrs)");
            float speed = sc.nextFloat();
            float time = (distance / speed);
            System.out.println("Time Taken for the distance is " + String.format("%.2f",time) + " Hrs");
            System.out.println("For Time in Minutes Press 1 else Press 0 ");
            float time2 = sc.nextInt();
            if (time2==1){
                System.out.println(time*60f + " Minutes");

            }
            else System.out.println("Thank You");
        }
        else if (a==3){
            System.out.println("Enter your Speed (in Km/Hrs)");
            float speed = sc.nextFloat();
            System.out.println("Enter your Time (in Hrs)");
            float time = sc.nextFloat();
            float distance = speed * time;
            System.out.println("Your Distance is "+ distance+"Kms");
            System.out.println("For Distance in Miles Press 1 else Press 0 ");
            float distance2 = sc.nextFloat();
            if (distance2==1){
                System.out.println(distance*0.62137f + " Miles");
            }
            else System.out.println("Thank You");
        }
        else {
            System.out.println("You pressed an invalid key");
        }
    }
}
