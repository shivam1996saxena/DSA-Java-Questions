import java.util.ArrayList;
import java.util.Arrays;

public class ruff_work {
    public static void main(String[] args) {
//        int [] a = {0,1,2,3,4};
//        int [] b = {0,1,2,2,1};
//        int [] ans = index(a,b);
//        System.out.println(Arrays.toString(ans));
        ArrayList<Integer> list = new ArrayList<Integer>();
    }
    static int [] index (int [] a, int [] b){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<a.length; i++) {
            list.add(b[i],a[i]);
        }
        int[] ans = new int[list.size()];
        for(int i=0 ; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
