public class Binary_Search_Rotated_findPivot {
    public static void main(String[] args) {
        int [] arr = {1,3,3,3,3,3};
        System.out.println(findINdex(arr,3));
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            // 4 cases for pivot
            if (mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start&&arr[mid]<arr[mid-1]){
                return mid;
            }
            if (arr[start]>arr[mid]){
                end = mid - 1;
            }
            if (arr[start]<arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findINdex(int [] arr, int target){
        int start = 0;
        int ans = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            // 4 cases for pivot
            if (arr[mid]==target){
                ans = mid;
                end = mid-1;
            }
           else if (arr[mid]>target){
                end = mid-1;
            }
           else if (arr[mid]<target){
                start = mid + 1;
            }
        }
        return ans;
    }
}
