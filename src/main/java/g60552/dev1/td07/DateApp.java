package g60552.dev1.td07;

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Année: ");
        int annee = clavier.nextInt();
        System.out.print("Mois: ");
        int mois = clavier.nextInt();

        DateUtil.afficherTitre(mois, annee);
        DateUtil.affichierEntete();
        int decalage = DateUtil.numeroJour(1, mois, annee);
        int jours = DateUtil.nombreJours(mois, annee);
        DateUtil.afficherMois(decalage, jours);
    }
}
