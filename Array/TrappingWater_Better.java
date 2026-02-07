package Array;

import java.util.Scanner;

public class TrappingWater_Better {

    public static void trappingWater(int arr[]){
        //int max = Integer.MIN_VALUE;
        int total_trapped_water = 0;

        //Creating Auxiliary Array
        //Left max array
        int left_max_array[] = new int[arr.length];
        left_max_array[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left_max_array[i] = (left_max_array[i-1] < arr[i]) ? arr[i] : left_max_array[i-1];
        }
        //Right max array
        int right_max_array[] = new int[arr.length];
        right_max_array[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right_max_array[i] = (right_max_array[i+1] < arr[i]) ? arr[i] : right_max_array[i+1];
        }
        //Calculate (min(lma, rma) - height) * width
        for (int i = 0; i < arr.length; i++) {
            int trapped_water = (Math.min(left_max_array[i], right_max_array[i]) - arr[i]);
            trapped_water = (trapped_water > 0) ? trapped_water : 0;
            total_trapped_water += trapped_water;
        }

        System.out.println("Total Trapped Water: " + total_trapped_water);
    }

    public static void main(String[] args) {
        //int arr[] = {4, 2, 0, 6, 3, 2, 5};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(arr.length < 3){
            System.out.println("Total Trapped Water: 0");
        }
        else {
            trappingWater(arr);
        }
    }
}
