package Array;

import java.util.Scanner;

public class StockPrice {

    public static int stock_profit(int arr[]){
        int max_profit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                max_profit = Math.max(max_profit, profit);
            }
            else {
                buyPrice = arr[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        //int arr[] = {4, 1, 2, 3, 6, 5};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum profit: " + stock_profit(arr));
    }
}
