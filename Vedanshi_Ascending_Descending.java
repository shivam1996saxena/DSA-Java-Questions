class search2{
    public  int Ascending(int [] arr,int start, int end, int find){
        // 1 2 3 4
        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]==find){
                return mid; // it refers to index
            }
            if (arr[mid]>find){
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return -1;
    }
    public  int Descending(int [] arr,int start, int end, int find){
        // 5 4 3 2
        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]==find){
                return mid; // it refers to index
            }
            if (arr[mid]>find){
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return -1;
    }
}
public class Vedanshi_Ascending_Descending {
    public static void main(String[] args) {
        search2 vedanshi = new search2();
    int [] arr = {1,2,3,4,5}; // Ascending array
    int [] myArr = {5,4,3,2,1}; // Descending array
        System.out.println(vedanshi.Ascending(arr,0, arr.length-1,5 ));
        System.out.println(vedanshi.Descending(myArr,0, arr.length-1,5 ));
    }
}

// 0-N 0 1 2 3 4...10
// miss