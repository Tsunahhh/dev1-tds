package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice01 {
    public static void main(String[] args) {
        int i, n;
        Scanner in = new Scanner(System.in);

        System.out.print("Donnez un nombre n: ");
        n = in.nextInt();

        System.out.println("\nNombre 1->n:");
        i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i += 1;
        }

        System.out.println("\nNombre pairs 1->n:");
        i = 1;
        while (i <= n) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i += 1;
        }

        System.out.println("\nNombres -n->n:");
        i = -n;
        while (i <= n) {
            System.out.print(i + " ");
            i += 1;
        }

        System.out.println("\nNombres 1->n divisible par 5:");
        i = 1;
        while (i <= n) {
            if (i % 5 == 0)
                System.out.print(i + " ");
            i += 1;
        }

        System.out.println("\nNombes 1->100 divisible par n:");
        i = 1;
        while (i < 100) {
            if (i % n == 0)
                System.out.print(i + " ");
            i += 1;
        }

    }
}
