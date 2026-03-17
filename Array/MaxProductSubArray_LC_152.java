package Array;

public class MaxProductSubArray_LC_152 {
    public static int maxProduct_normal(int arr[]){
        int maxProd = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int product = 1;
                for (int k = i; k <= j; k++) {
                    product *= arr[k];
                }
                if(product > maxProd){
                    maxProd = product;
                }
            }
        }
//        System.out.println(maxProd);
        return maxProd;
    }
    public static int maxProduct(int arr[]){
        int maxProd = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product *= arr[j];
                maxProd = Math.max(maxProd, product);
            }
        }

        System.out.println(maxProd);
        return maxProd;
    }

    // Optimal
    public static int maxProductOptimal(int arr[]){
        int maxProd = arr[0];
        int currMax = arr[0];
        int currMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = currMax;

            currMax = Math.max(arr[i], Math.max(currMax * arr[i], currMin * arr[i]));
            currMin = Math.min(arr[i], Math.min(temp * arr[i], currMin * arr[i]));

            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
    }


    public static void main(String[] args) {
        int arr[] = {-2,0,-1};

        maxProductOptimal(arr);
    }
}
