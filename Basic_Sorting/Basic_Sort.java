package Basic_Sorting;

import java.util.Arrays;

public class Basic_Sort {

    //Bubble Sort
    public static void bubble_sort(int arr[]){
        for (int turn = 0; turn < (arr.length - 1); turn++) {
            int swap = 0;
            for (int i = 0; i < (arr.length - 1) - turn; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap++;
                }
            }
            if(swap == 0){
                break;
            }
        }
        System.out.println("Bubble Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //Selection sort
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPosition] > arr[j]){
                    minPosition = j;
                }
            }
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
        System.out.println("\nSelection Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //Insertion sort
    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i-1;
            //Finding the right place
            while(prev >= 0 && arr[prev] > current){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //Insert
            arr[prev+1] = current;
        }
        System.out.println("\nInsertion Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //Counting sort
    public static void countingSort(int arr[]){
        //Finding the largest
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        //Counting the frequency of each element
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //Sort
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("\nCounting sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr_bubble[] = {5, 4, 1, 3 ,2};
        int arr_selection[] = {5, 4, 1, 3 ,2};
        int arr_insertion[] = {5, 4, 1, 3 ,2};
        int arr_counting[] = {5, 4, 1, 3 ,2};

        //Bubble Sort
        bubble_sort(arr_bubble);
        //Selection Sort
        selectionSort(arr_selection);
        //Insertion Sort
        insertionSort(arr_insertion);
        //Counting Sort
        countingSort(arr_counting);
    }
}
