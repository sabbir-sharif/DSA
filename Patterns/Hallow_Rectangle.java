/*
    * * * * *
    *       *
    *       *
    * * * * *
*/

public class Hallow_Rectangle {

    public static void hallow_rectangle(int row, int col){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if(i == 1 || j == 1 || i == row || j == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int n = 5;
//        for(int i = 1; i <= n; i++){
//            for (int j = 1; j <= n+1; j++) {
//                if(i == 1 || i == n){
//                    System.out.print("* ");
//                }
//                else {
//                    if ((i != 1 && j == 1 ) || (j == n+1 && i != n)){
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }

        hallow_rectangle(7, 10);

    }
}
