/*
    A
    B C
    D E F
    G H I J
*/

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        char ch = 'A';
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
