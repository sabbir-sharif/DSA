package Problem_Solving;

import java.util.Arrays;
import java.util.PriorityQueue;

//Problem: K-th largest element
//Platform: Leetcode_215
//Difficulty: Medium

//Problem understanding:
// - Find the k-th largest element from the given array.
// - Duplicate value is included. eg. 6, 6, 5
// - 2nd Largest is 6 not 5.

//Brute force:
//Sorting the array. then find the k number value from last
//Time: O(n log n)
//Space: O(1)

//Optimal:
//Using Min Heap. if size is greather than k remove the tov value.
//so the top value would be k-th largest element.
//One value add. position change - log n
//for n element - n log n
//Time: O(n log k)
//Heap is efficient when k << n

//What i learned:
//- Top k elements
//- K-th largest
//- K most frequent
//→ Think Heap immediately.

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
