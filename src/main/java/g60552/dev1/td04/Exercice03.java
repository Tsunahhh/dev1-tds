package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nbIteration, i;
        double somme, result;

        somme = 0;
        nbIteration = 5;
        i = 1;

        while (i <= nbIteration) {
            System.out.print("Introduisez un nombre: ");
            somme += in.nextDouble();
            i += 1;
        }

        result = somme / 5.0;

        System.out.println("Resultat = " + result);
    }
}
