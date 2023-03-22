package g60552.dev1.td06;

import java.util.Scanner;

public class Exercice05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Chaine de char: ");
        String chaineChar = in.nextLine();
        System.out.println("Première lettre: " + ChaineUtil.premiereLettre(chaineChar));
        System.out.println("Dernière lettre: " + ChaineUtil.derniereLettre(chaineChar));
    }
}
