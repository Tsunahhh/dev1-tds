package g60552.dev1.td07;

import java.util.Scanner;

public class Exercice03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Année: ");
        int annee = in.nextInt();
        System.out.print("Mois: ");
        int mois = in.nextInt();

        DateUtil.afficherTitre(mois, annee);

    }
}
