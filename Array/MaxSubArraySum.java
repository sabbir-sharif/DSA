package Problem_Solving;

public class MaxSubArraySum {
    public static void maxSubArray(int arr[]){
        int currentSum = 0, maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentSum = (currentSum <= 0) ? 0 : currentSum;
            currentSum = currentSum + arr[i];
            maxSum = (maxSum < currentSum) ? currentSum : maxSum;
        }
        //System.out.println("Max sub array sum: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        maxSubArray(arr);
    }
}
