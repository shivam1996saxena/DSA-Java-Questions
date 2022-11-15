import java.util.ArrayList;
import java.util.Scanner;

class visitor{
    public static void main(String[] args) {
            int [] arr = {5,4,300,20,1,2};
            int maximum = arr[0];
            int temp = 0;
            for (int i = 0;i<arr.length;i++){
                if (arr[i]>maximum){
                    maximum = arr[i];
                }
            }
            for (int i = 0;i<arr.length;i++){
                if (temp<arr[i]){
                    if (arr[i]==maximum){
                        continue;
                    }
                   else temp = arr[i];
                }
            }
            System.out.println(temp);
       }
    }