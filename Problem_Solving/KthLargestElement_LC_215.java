package Problem_Solving;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement_LC_215 {
    //Time: O(n log n)
    //Space: O(1)
    public static int kthLargest(int arr[], int k){
        Arrays.sort(arr);
        int result = arr[arr.length-k];

        return result;
    }
    //Min Heap
    //Optimal
    //Time: O(n log k)
    //Better for larger array
    public static int findKthLargest(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n : arr){
            pq.add(n);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println(findKthLargest(arr, k));
        for(int n: arr){
            System.out.print(n + " ");
        }
    }
}
