/*
    *
   **
  ***
 ****
*/

public class Inverted_Pyramid {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        //printing the white-space
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(j <= col-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
