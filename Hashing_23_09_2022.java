import java.security.KeyPair;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Hashing_23_09_2022 {
    public static void main(String[] args) {
        /*
        "aaabbbcccde"
        554321

         */
//        String str = "aaabbbcccde";
//        char [] arr = str.toCharArray();
//        System.out.println(frequency(arr));
//        Scanner sc = new Scanner(System.in);
//        int i,fact=1;
//        int number=sc.nextInt();//It is the number to calculate factorial
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);
        Scanner sc = new Scanner(System.in);
//        String str = "geeks";
//        int k = 2;
        int [] arr1 = {3,2,2,3};
        int [] arr2 = {3,4};
        System.out.println(Arrays.toString(removeElement(arr1,3)));


    }
    // 3 / C = 2 / ARR C + M + C
//    static boolean isPalindrome (String str, int k){
//        int end = str.length()-1;
//        int mid = str.length()/2;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == str.charAt(end));{
//                end--;
//            }
//            if (str.charAt(i) != str.charAt(end) && k>0) {
//                str.replace(str.charAt(end),str.charAt(i));
//                end--;
//                k--;
//            }
//        }
//        for (int i = mid,j = mid; i >= 0; i--,j++) {
//            if (str.charAt(i) == str.charAt(j)){
//                continue;
//            }
//            else return false;
//        }
//        return true;
//    }
    static int [] removeElement (int [] nums, int val){
        int counter = 0;
        int j = 0;
        int [] temp = new int [nums.length];
        for(int i = 0;i<nums.length;i++){
            if (nums[i] == val){
                counter++;
            }
            else{
                temp[j] = nums[i];
                j++;
            }
        }
        nums = new int [temp.length-counter];
        for(int i = 0;i < temp.length-counter;i++){
            nums[i] = temp[i];
        }
        return nums;
    }
    static double mediian (int [] nums1, int [] nums2){
        int [] mix = new int[nums1.length + nums2.length];
        int i = 0;              //indexOfFirst
        int j = 0;            //indexOfSecond
        int k = 0;              //indexOfMix
        while (i < nums1.length  && j < nums2.length ){
            if (nums1[i]<nums2[j]){
                mix[k] = nums1[i];
                i++;
            }
            else {
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length){
            mix[k] = nums2[j];
            j++;
            k++;
        }
        double ans = 0;
        if (mix.length % 2 == 0){
            int m = mix.length/2;
            ans = (double) (mix[m] + mix[m-1])/2;
            return ans;
        }
        else {
            int m = mix.length/2;
            ans = (double) (mix[m]);
            return ans;
        }
    }
    static int [] makeArray (int mid){
        int count = 0;
        for (int i = 1; i < mid; i++) {
            count++;
        }
        int [] arr = new int[count*2 + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        return arr;
    }
    static int fact (int x){
        if (x==1){
            return 1;
        }
        return (x+fact(x-1));
    }
    /*
    x + y = z
    y = z - x
    */
    static HashMap frequency(char [] arr){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else {
                hashMap.put(arr[i],1);
            }
        }
        return hashMap;
    }
    static ans twoSum(int [] arr, int target){
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            hash.put(arr[i],i);
        }
        ans a = new ans(-1,-1);
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(target-arr[i])){
                a = new ans(arr[i],target-arr[i]);
            }
        }
        return a;
    }
    static ans missing (int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
        ans x = new ans();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i+1){
                x.x = arr[i];
                x.y = i+1;
            }
        }
        return x;
    }

}
class ans {
    int x;
    int y;

    public ans(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ans() {
    }
}