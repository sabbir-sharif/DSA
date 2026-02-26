package Problem_Solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm_LC_989 {
    //Brute Force
    //Overflow problem
    public static List<Integer> addToArrayForm_BF(int arr[], int k){
        int len = arr.length;
        int arrayTen[] = new int[len];
        for (int i = 0; i < len; i++) {
            arrayTen[i] = (int) Math.pow(10, i);
        }
        long num = 0;
        for (int i = 0, j = len-1; i < arr.length; i++, j--) {
            num += (arr[i]*arrayTen[j]);
            //System.out.print(num + " ");
        }
        num += k;
        List<Integer> result = new ArrayList<>();
        while(num > 0){
            result.add((int) (num % 10));
            num /= 10;
        }
        Collections.reverse(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) +  " ");
        }
        return result;
    }
    //Optimal
    public static List<Integer> addToArrayForm(int arr[], int k){
        List<Integer> result = new ArrayList<>();
        int i = arr.length - 1;
        while(i >= 0 || k > 0){
            if(i >= 0){
                k += arr[i];
                i--;
            }
            result.add(k % 10);
            k /= 10;
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;

        List<Integer> list = new ArrayList<>();
        list = addToArrayForm(arr, k);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
