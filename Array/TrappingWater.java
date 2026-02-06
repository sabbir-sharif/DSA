package Array;

import java.util.Scanner;

public class TrappingWater {

    public static int left_max(int arr[], int index){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            max = (arr[i] > max) ? arr[i] : max;
        }
        return max;
    }
    public static int right_max(int arr[], int index){
        int max = Integer.MIN_VALUE;
        for (int i = index+1; i < arr.length; i++) {
            max = (arr[i] > max) ? arr[i] : max;
        }
        return max;
    }

    public static void main(String[] args) {
        //int arr[] = {4, 2, 0, 6, 3, 2, 5};
        //int arr[] = {2, 4, 6, 8, 5, 2, 1};
        //int arr[] = {4, 2};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left_max;
        int right_max;
        int total_water_trapped = 0;
        if(arr.length < 3){
            total_water_trapped = 0;
        }
        else {
            for (int i = 1; i < arr.length-1; i++) {
                left_max = left_max(arr, i);
                right_max = right_max(arr, i);

                int water_trapped = (Integer.min(left_max, right_max) - arr[i] ) * 1;
                total_water_trapped = (water_trapped < 0) ? (total_water_trapped+0) : (total_water_trapped+water_trapped);
            }
        }
        System.out.println("Total water Trapped: " + total_water_trapped);
    }
}
