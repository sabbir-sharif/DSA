package Array;

import java.util.Scanner;

public class SearchIn2DArray {

    public static void stairCaseSearch(int arr[][], int key){
        int row = 0;
        int col = arr[0].length - 1;
        boolean isFound = false;

        while(row < arr.length && col >= 0){
            //Found
            if (arr[row][col] == key){
                isFound = true;
                break;
            } else if (key < arr[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        if(isFound){
            System.out.println(key + " is in cell: " + row + ", " + col);
        }
        else {
            System.out.println(key + " is not found in the array!!");
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2 , 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();
        stairCaseSearch(arr, key);
    }
}
