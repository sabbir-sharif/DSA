/*
    Diamond is 2 triangle in mirror position
        *
       ***
      *****
     *******
     *******
      *****
       ***
        *
*/

public class Diamond {
    public static void main(String[] args) {
        int n = 3;
        int row = n *2;

        for (int i = 1; i <= n; i++) {
            //Space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //Star
            for (int j = 1; j <= (i * 2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Mirror
        for (int i = n; i >= 1; i--) {
            //Space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //Star
            for (int j = 1; j <= (i * 2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
