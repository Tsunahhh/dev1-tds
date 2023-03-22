package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice02 {
    public static void main(String[] args) {

        int n, i;

        Scanner in = new Scanner(System.in);

        i = 0;
        System.out.print("Nombre de tirets: ");
        n = in.nextInt();

        while (i < n) {
            System.out.print("-");
            i += 1;
        }

    }
}
