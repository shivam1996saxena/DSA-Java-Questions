import java.util.Scanner;
public class terenary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();


        for (int i = 1;i<0;i++){
             int age1 = h1 + v1;
             for (int j = 1;j<0;j++){
                 int age2 = h2 + v2;
                 if((age1-age2)==0){
                     System.out.println("Yes");
                     break;
                 }
             }
        }
    }
}
