package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {
    public static int kthSmallest_naive(int arr[], int k){
        Arrays.sort(arr);
        int result = arr[k-1];

        return result;
    }
    public static int kthSmallest(int arr[], int k){
        //Max Heap -> Comparator.reverseOrder()
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int n: arr){
            pq.add(n);

            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;

        kthSmallest(arr, k);
    }
}
