/*
         *****
        *   *
       *   *
      *   *
     *****
 */

public class Hallow_Rhombus {
    public static void main(String[] args) {
        int row = 5;
        int col = (row*2)-1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 5; j++) {
                if(i == 1 || i == 5){
                    System.out.print("* ");
                }
                else {
                    if (j == 1 || j == 5){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
