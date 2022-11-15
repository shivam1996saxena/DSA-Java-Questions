import java.util.*;

public class Sept_DSA_1_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int [] arr = {1,2,3,9,5,4,6,10};
//        for (int i = 0; i < n; i++) {
//            arr [i] = sc.nextInt();
//        }
//        System.out.println(frequency(arr));
//        System.out.println(unique(arr));
//        int startIndex = 3;
//        int endIndex = 6;
//        int i = startIndex;
//        int j = i+1;
//        while (i > endIndex){
//            if (j<=endIndex && arr[i] > arr[j]){
//                j++;
//            }
//        }
        System.out.println(Exam(4,2));

    }
    static HashMap frequency (char [] arr){
        HashMap<Character,Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])){
                hash.put(arr[i],hash.get(arr[i])+1);
            }
            else {
                hash.put(arr[i],1);
            }
        }
        return hash;
    }
    static HashSet unique (int [] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        return hashSet;
    }
    static void sortWindow (int [] arr, int startIndex, int endIndex){
        for (int i = startIndex; i < endIndex; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    static String Exam (int n,int m){
        int c = 0;
        for (int i = 2; i <= n ; i++) {
            if (i % 2== 0 && n % i == 0){
                c++;
            }
        }
        if (c == m){
            return "Yes";
        }
        else return "No";
    }

}
