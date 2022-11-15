import java.util.Scanner;
class basic_sort
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array;
    void inputArray()
    {
        array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
    }
    void printArray()
    {
        System.out.println("Your Array is : - ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    void bubbleSortArray()
    {
        for (int i=0;i<array.length-1;i++)
        {
            for (int j=0;j<array.length-1-i;j++)
            {
                if (array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    void bubbleSortDescending()
    {
        for (int i=0;i<array.length-1;i++)
        {
            for (int j=0;j<array.length-1-i;j++)
            {
                if (array[j]<array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    void selectionSort()
    {
        int smallest;
        for (int i=0;i<array.length-1;i++)
        {
            smallest = i;
            for (int j=i+1;j< array.length;j++)
            {
                if (array[smallest] > array[j])
                {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
    }
    void insertionSort()
    {
    for (int i = 1;i< array.length;i++)
    {
        int current = array[i];
        int j = i - 1;
        while (j>=0 && current < array[j])
        {
           array[j+1] = array[j];
           j--;
        }
        // placement of element
        array[j+1] = current;
    }
    }
    void insertionSortTwo()
    {
        for (int i = 1;i< array.length;i++)
        {
            int temp = array[i];
            int j = i;
            while (j>0 && array[j-1]>temp)
            {
                array[j] = array[j-1];
                j--;
            }
            array [j] = temp;
        }
    }
}
public class Sort {
    public static void main(String[] args) {
        basic_sort obj = new basic_sort();
        obj.inputArray();
        obj.printArray();
        obj.insertionSortTwo();
        obj.printArray();
        obj.insertionSort();
        obj.printArray();
    }
}


