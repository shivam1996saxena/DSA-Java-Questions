import java.util.Objects;
import java.util.Vector;
class permutations {
    public static void main(String[] args) {
        String[] arr = {"d", "e", "f"};
        int X = arr.length;
        String[] arr1 = arr;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        int count = arr1.length;
        for (int z = 0; z < X - 1; z++) {
            Vector<String> tmp = new Vector<String>();
            for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k < arr1.length; k++) {
                    if (!Objects.equals(arr[i], arr1[k])) {
                        tmp.add(arr1[k] + arr[i]);
                        count += 1;
                    }
                }
            }

            for (int i = 0; i < tmp.size(); i++) {
                System.out.print(tmp.get(i) + " ");
            }
            arr1 = tmp.toArray(new String[0]);
        }
    }
}