package Problem_Solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistribution_gfg {
    public static int findMinDiff(ArrayList<Integer> arr, int m){
        Collections.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - m + 1; i++) {
            int difference = arr.get(i + m - 1) - arr.get(i);
            minDifference = (minDifference > difference) ? difference : minDifference;
            System.out.println(minDifference);
        }

        return minDifference;
    }
    public static void main(String[] args) {
        //int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        ArrayList<Integer> arr = new ArrayList<>(
                Arrays.asList(11, 13, 7, 5, 13, 12));
        int student = 4;

        System.out.println(findMinDiff(arr, student));
    }
}
