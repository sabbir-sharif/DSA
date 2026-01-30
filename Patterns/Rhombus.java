/*
        *****
       *****
      *****
     *****
    *****
*/

public class Rhombus {
    public static void main(String[] args) {
        int row = 5;
        int col = (row * 2)-1;

        for (int i = 1; i < row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
