/*
1
2 3
4 5 6
7 8 9 10
*/

public class Floyed_triangle {
    public static void main(String[] args) {
        int line = 5;
        int n = 1;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
