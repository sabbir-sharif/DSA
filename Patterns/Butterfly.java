/*
    *      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *
*/

public class Butterfly {
    public static void main(String[] args) {
        int row = 4;
        int col = row*2;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if((j <= i) || (j > (col-i))){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= col; j++) {
                if((j <= i) || (j > (col - i))){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
