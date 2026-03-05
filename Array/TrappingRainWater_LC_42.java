package Array;

public class TrappingRainWater_LC_42 {
    //Problem: Trapping Water LC_42
    //Type: Prefix Max/Two Pointer
    //Explaination: Calculate left and right max height for each index
    //              Calculate trapping water for every index (min(left, right)-index value)
    //              if negative -> 0
    //              Calculate total by summing all

    //Time: O(n)
    //Space: O(n) -> for extra array

    //Learning: How prefix calculation reduce time complexity.
    //From O(n^2) to O(n)

    //More optimal : Two pointer
    //Space: O(1)
    public static int trappingRainWater(int arr[]){
        int left_max[] = new int[arr.length];
        int right_max[] = new int[arr.length];

        //left max
        left_max[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left_max[i] = (left_max[i-1] < arr[i]) ? arr[i] : left_max[i-1];
        }
        //right max
        right_max[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right_max[i] = (right_max[i+1] < arr[i]) ? arr[i] : right_max[i+1];
        }
        //calculating trapped water
        int total_trapped_water = 0;
        for (int i = 0; i < arr.length; i++) {
            int trapped_water = (Integer.min(left_max[i], right_max[i])) - arr[i];
            trapped_water = (trapped_water > 0) ? trapped_water : 0;
            total_trapped_water += trapped_water;
        }
        return total_trapped_water;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};

        System.out.println(trappingRainWater(arr));
    }
}
