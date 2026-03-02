package Problem_Solving;

import java.util.*;

public class min_max_in_array_gfg {
    public static ArrayList<Integer> minMaxFromArray(int arr[]){
        ArrayList<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int n: arr){
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        result.add(min);
        result.add(max);

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9};
        ArrayList<Integer> min_max = minMaxFromArray(arr);
        System.out.println(min_max);
    }
}