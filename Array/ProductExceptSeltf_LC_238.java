package Array;

public class ProductExceptSeltf_LC_238 {
    //Approach: calculate total product non-0 elements
    //check how many zeros are there
    //if total_zero > 1 -> all value will be 0
    //else_if total_zero == 1 -> 0 value index will be total product else all 0
    //else product[i] = total product / arr[i]

    //Time Complexity: O(n)
    //Space : O(n)

    //Issue: Used division here. some problem restrict using division
    //Solution: use prefix & suffix product
    public static int[] productExceptSelfr(int arr[]){
        int product[] = new int[arr.length];
        int prod = 1;
        int count_zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                prod *= arr[i];
            }
            if(arr[i] == 0){
                count_zero++;
            }
        }
        if(count_zero > 1){
            for (int i = 0; i < arr.length; i++) {
                product[i] = 0;
            }
        }
        else if(count_zero == 1){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0){
                    product[i] = prod;
                }
                else {
                    product[i] = 0;
                }
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                product[i] = prod / arr[i];
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(product[i] + " ");
//        }
        return product;
    }

    //Optimal
    public static int[] productExceptSelf(int arr[]){
        int result[] = new int[arr.length];
        result[0] = 1;
        //prefix product
        for (int i = 1; i < arr.length; i--) {
            result[i] = result[i-1] * arr[i-1];
        }
        //Suffix product
        int right = 1;
        for (int i = arr.length-1; i >= 0; i++) {
            result[i] *= right;
            right *= arr[i];
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[] = {-1,1,0,-3,3};

        productExceptSelf(arr);
    }
}
