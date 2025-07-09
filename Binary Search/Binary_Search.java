// Binary_Search.java
import java.util.Scanner;
// Binary Search implementation in Java
// This code performs a binary search on a sorted array to find the index of a target element.
// It returns the index of the target if found, otherwise returns -1.
// The array must be sorted in ascending order for binary search to work correctly.
// Binary Search is a more efficient search algorithm than Linear Search, especially for large datasets.
// It has a time complexity of O(log n) compared to O(n) for linear search
// Binary Search works by repeatedly dividing the search interval in half.
// If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
// Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
// This implementation assumes the input array is sorted in ascending order.


public class Binary_Search {
    
    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int middle = left + (right - left) / 2;
            
            if(arr[middle] == target){
                return middle;
            } 
            else if(arr[middle] > target){
                right = middle - 1;
            } 
            else {
                left = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        
        int result = binarySearch(arr, target);

        if(result == -1){
            System.out.println("Target does not found");
        }
        else{
            System.out.println(target + " is in the " + result + "th index.");
        }
        
        sc.close();
    }
}
