package g60552.dev1.td4;

import java.util.Scanner;

public class Exercice06 {
    public static void main(String[] args) {

        // -> Déclaration des variables.
        Scanner in = new Scanner(System.in);
        int neg, pos, nul, nbValeurs, i;
        double valeur;

        neg = 0;
        pos = 0;
        nul = 0;
        i = 1;

        System.out.println("Nombre de valeurs a prendre en compte: ");
        nbValeurs = in.nextInt();

        // -> Boucle pour pour compter en triant les valeurs.
        while (i <= nbValeurs) {
            System.out.println("Valeur " + i + ": ");
            valeur = in.nextDouble();
            if (valeur == 0)
                nul += 1;
            else if (valeur < 0)
                neg += 1;
            else
                pos += 1;
            i += 1;
        }

        // -> Affichage du tri
        System.out.println("Positifs : " + pos);
        System.out.println("Negatifs : " + neg);
        System.out.println("Nuls : " + nul);
    }
}
