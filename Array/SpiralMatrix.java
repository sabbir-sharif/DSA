package Array;

public class SpiralMatrix {
    public static void spiralMatrix(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        //Spiral Matrix
        while(startRow <= endRow && startCol <= endCol){
            //Top Column
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            //Right Row
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            //Bottom Column
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(arr[endRow][j] + " ");
            }
            //Left Row
            for (int i = endRow - 1; i > startRow; i--) {
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2 , 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        spiralMatrix(matrix);
        System.out.println();

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
