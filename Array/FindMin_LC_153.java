package Array;

public class FindMin_LC_153 {
    public static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};

        findMin(arr);
    }
}
