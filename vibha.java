import java.util.*;
/*
Given a String str with multiple repeated characters you have to print only unique ones;
input : aaaabbbcdeee
output : cd
 */

public class vibha {
    public static void main(String[] args) {
        String str = "0abcdeedcba0";
        System.out.println(isPalindrome(str));
        Stack <Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(60);
        stack.push(50);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        Queue <Integer> q = new ArrayDeque<>();
        q.add(15);
        q.add(30);
        System.out.println(q.peek());
        System.out.println(q);
    }
    static boolean isPalindrome (String str){
        if (str.length()%2!=0){
            System.out.println("ENTER Valid String");
            return false;
        }
        // 2n 1 2 3 1 2 3
        int m = str.length()/2;
        boolean ans = false;
        for (int i = m-1,j = m;i >= 0 ; i--, j++) {
            if (str.charAt(i)==str.charAt(j)){
                ans = true;
            }
            else {
                ans = false;
                break;
            }
        }
        return ans;
    }
    static HashMap frequency (int [] arr){
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        return map;
    }
    static boolean isPanagram (String str){ //int char boolean float long double / Wrapper class
        HashSet <Character> hash = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            hash.add(str.charAt(i));
        }
        boolean ans = false;
        if (hash.size()==26){
            ans = true;
            return ans;
        }
        else return ans;
    }
    static index  indexesOfTarget (int [] arr, int target){
        index pair = new index(-1,-1);
        int s = 0;
        int e = arr.length-1;
        while (s < e){
            int m = s + (e-s)/2;
            if (arr[m]==target){
                pair.firstIndex = m;
                e = m-1;
            }
            if (arr[m]<target){
                s = m+1;
            }
            if (arr[m]>target){
                e = m-1;
            }
        }
        int s2 = 0;
        int e2 = arr.length-1;
        while (s2 < e2){
            int m = s2 + (e2-s2)/2;
            if (arr[m]==target){
                pair.SecondIndex = m;
                s2 = m+1;
            }
            if (arr[m]<target){
                s2 = m+1;
            }
            if (arr[m]>target){
                e2 = m-1;
            }
        }
        return pair;
    }
}
class index {
    int firstIndex;
    int SecondIndex;

    public index(int firstIndex, int secondIndex) {
        this.firstIndex = firstIndex;
        SecondIndex = secondIndex;
    }
}