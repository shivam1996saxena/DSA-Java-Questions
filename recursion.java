public class recursion {
    public static void main(String[] args) {
        patter_rec(5);
    }
    public static int fn(int n){
        if (n==0){
            return 1;
        }
        System.out.print(n + " ");
        return fn(n-1);
    }
    public static void fnp(int n){
       if (n==0){
           return;
       }
        fnp(n-1);
        System.out.print(n + " ");
    }
    public static void patter_rec(int x) {
        if (x > 0){
            patter_rec(x - 1);
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
