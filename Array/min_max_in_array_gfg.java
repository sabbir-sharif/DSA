package Problem_Solving;

import java.util.*;

public class min_max_in_array_gfg {
    public static ArrayList<Integer> minMaxFromArray_normal(int arr[]){
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
    // Optimal
    public static ArrayList<Integer> minMaxFromArray(int arr[]){
        ArrayList<Integer> result = new ArrayList<>();

        int min, max, i;

        if(arr.length % 2 == 0){
            if(arr[0] < arr[1]){
                min = arr[0];
                max = arr[1];
            }
            else {
                min = arr[1];
                max = arr[0];
            }
            i = 2;
        }
        else {
            min = max = arr[0];
            i = 1;
        }

        while(i < arr.length-1){
            if(arr[i] < arr[i+1]){
                if(arr[i] < min){
                    min = arr[i];
                }
                if(arr[i+1] > max){
                    max = arr[i+1];
                }
            }
            else {
                if(arr[i+1] < min){
                    min = arr[i+1];
                }
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            i += 2;
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