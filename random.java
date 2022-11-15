import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random vedanshi = new Random();
        int number;
        for (int counter=1;counter<=15;counter++){
            number = 1+vedanshi.nextInt(6);
            System.out.println(number);
        }
    }
}
