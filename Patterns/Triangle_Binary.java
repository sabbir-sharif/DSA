/*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/

public class Triangle_Binary {
    public static void main(String[] args) {
        int n = 5;
        int x;

        for (int i = 1; i <= n; i++) {
            //x = ((i % 2) == 0) ? 0 : 1;
            x = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x = 1 - x; // true/ false -> !x , bitwise -> ~x , binary -> 1-x
            }
            System.out.println();
        }
    }
}
