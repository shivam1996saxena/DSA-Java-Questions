import java.util.Random;
import java.util.Scanner;
class Stone_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random comp = new Random();
        System.out.println("Welcome to \"Stone\" \"Paper\" \"Scissor\" \nPress 1 to Play!");
        int input = sc.nextInt();
        if (input==1){
            System.out.println("Press 1 to play 1 match against Computer");
            System.out.println("Press 2 to play 3 matches against Computer");
            System.out.println("Press 3 to play 5 matches against Computer");
            int input1 = sc.nextInt();
            int number = 0;
            for (int counter=1;counter<=20;counter++){
                number = 1+comp.nextInt(3);
            }
            if (input1 == 1){
                System.out.println("Choose \"1\" for Stone");
                System.out.println("Choose \"2\" for Paper");
                System.out.println("Choose \"3\" for Scissor");
                int input3 = sc.nextInt();
                switch (input3){
                    case 1 : {
                        if (number==1){
                        System.out.println("Its a \"DRAW\" Computer chooses the same");
                        break;
                    }
                    else if (number==2){
                        System.out.println("\"You LOOSE\" Computer chooses the Paper");
                            break;
                    }
                    else {
                        System.out.println("\"You WON\" Computer chooses the Scissor");
                            break;
                        }}
                    case 2 : {
                        if (number==1){
                            System.out.println("\"You WON\" Computer chooses the Stone");
                            break;
                        }
                        else if (number==2){
                            System.out.println("Its a \"DRAW\" Computer chooses the same");
                            break;
                        }
                        else {
                            System.out.println("\"You LOOSE\" Computer chooses the Scissor");
                            break;
                        }

                    }
                    case 3 : {
                        if (number==1){
                            System.out.println("\"You LOOSE\" Computer chooses the Stone");
                            break;
                        }
                        if (number==2){
                            System.out.println("\"You WON\" Computer chooses the Paper");
                            break;
                        }
                        else {
                            System.out.println("Its a \"DRAW\" Computer chooses the same");
                            break;
                        }
                    }
                }

            }

        }
        else System.out.println("Please enter a valid key to start the game");


    }
}
