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
        System.out.println("Selection Sort: ");
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
        System.out.println("Insertion Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3 ,2};

        //Bubble Sort
        //bubble_sort(arr);
        //Selection Sort
        //selectionSort(arr);
        //Insertion Sort
        insertionSort(arr);
    }
}
