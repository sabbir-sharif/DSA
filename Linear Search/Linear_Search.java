import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Linear_Search {
    
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int index = linearSearch(arr, target);

        if (index == -1){
            System.out.println("Element not found");
        } else {
            System.out.println(target + " is in the " + index + "th index of the array");
        }
    }   
}
