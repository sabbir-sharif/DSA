package Problem_Solving;

public class PlusOne_LC_66 {
    //if num[i] < 9, num[i]++
    //if num[i] == 9, num[i] = 0, num[i-1]++
    //all numbers are 9 (999)
    //new array size = old array size + 1
    //newArr[0] = 1, rest = 0
    public static int[] plusOne(int arr[]){
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int newArr[] = new int[arr.length+1];
        newArr[0] = 1;
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 9};

        int resultArr[] = plusOne(arr);

        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i] + " ");
        }
    }
}
