package Problem_Solving;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_LC_1 {
    //Time: O(n^2)
    //Space: O(1)
    public static int[] twoSum(int arr[], int target){
        int indices[] = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }
    //Time: O(n)
    //Space: O(n)
    public static int[] twoSumOptimized(int arr[], int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int x = target - arr[i];
            if(map.containsKey(x)){
                return new int[] {map.get(x), i};
            }
            else {
                map.put(arr[i], i);
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        //twoSum(arr, target);
        twoSumOptimized(arr, target);
    }
}
