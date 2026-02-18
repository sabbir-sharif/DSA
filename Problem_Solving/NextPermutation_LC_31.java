package Problem_Solving;

import java.util.Arrays;

/*
Find pivot -> from right to left arr[i] < arr[i+1]
find the greater than pivot from right part of the array [pivot + 1, end] right to left
swap(pivot, successor)
reverse the array part. [pivot+1, end]

if no pivot found -> reverse the array
*/

public class NextPermutation_LC_31 {
    public static void nextPermutaion(int num[]){
        int pivot = -1, successor = Integer.MAX_VALUE;
        boolean isSorted = true;
        for (int i = num.length - 2; i >= 0; i--) {
            if(num[i] < num[i+1]){
                pivot = i;
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            for (int i = 0; i < num.length/2; i++) {
                int temp = num[i];
                num[i] = num[num.length - 1 - i];
                num[num.length - 1 - i] = temp;
            }
        }
        else {
            for (int i = num.length-1; i > pivot; i--) {
                if(num[i] > num[pivot]){
                    int temp = num[i];
                    num[i] = num[pivot];
                    num[pivot] = temp;
                    break;
                }
            }
            //everse(num, pivot+1, num.length-1);
            int start = pivot + 1, end = num.length-1;
            while(start < end){
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1};

        nextPermutaion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
