public class Check_Array_sort {
    public static void main(String[] args) {
        int [] myArray = {1, 2, 40, 11};
        int aim = myArray.length;
        boolean isArraySorted = false;
        int check = 0;
        for (int i=0;i<myArray.length;i++) {
            if (check < myArray[i]) {
                check = myArray[i];
            }
        }
        if (check == myArray[aim-1]) {
            isArraySorted = true;
        }
            if (isArraySorted){
                System.out.println("Your Array is Sorted");
            }
            else System.out.println("Your Array is not Sorted");
        }
    }
