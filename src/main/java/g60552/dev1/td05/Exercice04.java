package g60552.dev1.td5;

import java.util.Scanner;

public class Exercice04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int longueurMot;
        char premLettre, derLettre;

        System.out.print("Entrer un mot: ");
        String mot = in.nextLine();
        longueurMot = mot.length();
        premLettre = mot.charAt(0);
        derLettre = mot.charAt(longueurMot - 1);

        if (premLettre == derLettre)
            System.out.println("La premiere et derniere lettre du mot " + mot + " sont égales.");
        else
            System.out.println("La premiere et derniere lettre du mot " + mot + " ne sont pas égales.");

    }
}
