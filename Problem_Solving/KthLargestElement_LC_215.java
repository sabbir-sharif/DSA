package Problem_Solving;

import java.util.Arrays;

public class KthLargestElement_LC_215 {
    public static int kthLargest(int arr[], int k){

        Arrays.sort(arr);
        int result = arr[arr.length-k];
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println(kthLargest(arr, k));
        for(int n: arr){
            System.out.print(n + " ");
        }
    }
}
