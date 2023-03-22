package g60552.dev1.td2;

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        double prixHorsTva, tauxTva, prix;
        int quantite;
        Scanner in = new Scanner(System.in);

        System.out.print("Prix Hors TVA: ");
        prixHorsTva = in.nextDouble();
        System.out.print("Taux de TVA: ");
        tauxTva = in.nextDouble();
        System.out.print("Quantite de produit: ");
        quantite = in.nextInt();

        prix = quantite * (prixHorsTva + prixHorsTva*(tauxTva/100));

        System.out.println("Prix avec Tva : " + prix + "euros");
    }
}
