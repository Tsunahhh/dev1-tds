package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, n;
        double somme, result;

        i = 1;
        somme = 0;
        System.out.print("Introduire le nombre de valeurs à introduire: ");
        n = in.nextInt();

        while (i <= n) {
            System.out.print("Valeur " + i + ": ");
            somme += in.nextDouble();
            i += 1;
        }

        result = somme / n;

        System.out.println("La moyenne vaut: " + result);

    }
}
