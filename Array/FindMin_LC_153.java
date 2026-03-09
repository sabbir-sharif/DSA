package Array;

public class FindMin_LC_153 {
    public static int findMin_naive(int arr[]){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }
    public static int findMin(int arr[]){
        int right = arr.length-1;
        int left = 0;

        while(left < right){
            int mid = (left + right)/2;

            if (arr[mid] > arr[right]){
                left = mid +1;
            }
            else{
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};

        int result = findMin(arr);
        System.out.println(result);
    }
}
