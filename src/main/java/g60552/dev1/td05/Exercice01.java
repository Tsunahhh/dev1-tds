package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("n: ");
        n = in.nextInt();

        System.out.println("Nbs 1 -> " + n + ": ");
        for (int i = 1; i <= n; i = i + 1) {
            System.out.print(i + " ");
        }

        System.out.println("\nNbs pairs 1 -> " + n + ": ");
        for (int i = 1; i <= n; i = i + 1) {
            if (i%2 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\nNbs -" + n + " -> " + n + ": ");
        for (int i = -n; i <= n; i = i + 1) {
            System.out.print(i + " ");
        }

        System.out.println("\nMultiple de 5 (1->" + n + "): ");
        for (int i = 1; i <= n; i = i + 1) {
            if (i%5 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\nMultiple de " + n + " (1->100): ");
        for (int i = 1; i <= 100; i = i + 1) {
            if (i%n == 0)
                System.out.print(i + " ");
        }

    }
}
