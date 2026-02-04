package Array;

import java.sql.Array;

public class NewArray {

    //Array as argument
    //any changes in the method array also changed in main array
    public static void arrayAsArgument(int newArray[]){
        for (int i = 0; i < 5; i++) {
            newArray[i] = newArray[i] + 1;
        }
    }

    //Lenear Search
    public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    //Largest Number
    public static int largestNumber(int arr[]){
        int largestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= largestNumber){
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }
    //Binary Search
    public static int binarySearch(int arr[], int key){
        //Define start and end index
        int start = 0, end = arr.length -1;
        //Compare
        while(start <= end){
            //define mid
            int mid = (start + end) / 2;
            //found
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;

    }
    //Reverse in Array
    public static void reverseInArray(int arr[]){
        int left = 0, right = arr.length - 1;
        int temp;
        while(left <= right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Pairs in Array
    public static void pairsInArray(int arr[]){
        int totalPair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pair: " + totalPair);
    }
    //Sub Array
    public static void subArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    //Max SubArray Sum
    public static void maxSubArraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                maxSum = (maxSum < currentSum) ? currentSum : maxSum;
            }
        }
        System.out.println("Max sub array sum: " + maxSum);
    }
    //Max sub array sum with prefex sum
    public static void maxSubArraySum_2(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentSum = (i == 0) ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                maxSum = (maxSum < currentSum) ? currentSum : maxSum;
            }
        }
        System.out.println("Max sub array sum(Prefix sum): " + maxSum);
    }
    //Max sub array sum - Kadanes's Algorithm
    public static void maxSubArrSumKadane(int arr[]){
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            currentSum = (currentSum < 0) ? 0 : currentSum;
            maxSum = (maxSum < currentSum) ? currentSum : maxSum;
        }
        System.out.println("Max Sub arr sum - Kadane's: " + maxSum);
    }


    public static void main(String[] args) {
        //creating an array
        //dataType arrayName[] = new dataType[size]
        int myArraay[] = new int[5];
        for (int i = 0; i < 5; i++) {
            myArraay[i] = i+1;
        }
        for (int i = 0; i < 5; i++) {
            //System.out.print(myArraay[i] + " ");
        }
        //System.out.println();

        //dataType arrayName = {v1, v2, ...}
        int myArray_2[] = {2, 4, 6, 8, 10, 15};
        int newArray[] = {1, -2, 6, -1, 3};

        for (int i = 0; i < 5; i++) {
            //System.out.print(myArray_2[i] + " ");
        }
        //System.out.println();

        //arrayAsArgument(myArray_2);
        //After modify the array
        System.out.println("After Changes in myArray_2: ");
        for (int i = 0; i < 5; i++) {
            //System.out.print(myArray_2[i] + " ");
        }
        System.out.println();

        //linear Search
        int value = 8;
        int isFound = linearSearch(myArray_2, value);
        if(isFound == -1){
            //System.out.println(value + " doesn't exist");
        }
        else {
            //System.out.println(value + " is in index: " + isFound);
        }

        //Largest Number
        //System.out.println("Largest number: " + largestNumber(myArray_2));

        //Binary Search
        int value_binary = 12;
        int found = binarySearch(myArray_2, value_binary);
        if(found == -1){
            //System.out.println(value_binary + " doesn't exist");
        }
        else {
            //System.out.println(value_binary + " is in index: " + found);
        }

        //Reverse In Array
        reverseInArray(myArray_2);
        //Pairs in Array
        pairsInArray(myArray_2);
        //Sub Array
        subArray(myArray_2);
        //Max Sub Array Sum
        maxSubArraySum(newArray);
        //Max Sub Array Sum 2 (Prefix sum)
        maxSubArraySum_2(newArray);
        //Max sub array sum - Kadane's
        maxSubArrSumKadane(newArray);
    }
}
