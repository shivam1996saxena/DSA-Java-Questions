    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.Scanner;

public class Arena_1D_max_frequency {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = c.nextInt();
        }
        //5 4 6 7 6 5 1 2 5 5 6
        Arrays.sort(arr);
        // 1 2 4 5 5 5 5 6 6 6 7
        // Ans : 5
        int maximumfrequency = 0;
        int maxIndex = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else hash.put(arr[i], 1);
           int count = hash.get(arr[i]);
            if (count>=maximumfrequency){
                maximumfrequency = count;
                maxIndex = i;
            }
        }
        System.out.print(arr[maxIndex]);
    }
}















