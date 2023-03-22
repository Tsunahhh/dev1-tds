package g60552.dev1.td08;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class DateUtil {

    //td 7 Exercice01 + td8 Exercice01
    public static String nomMois(int mois) {
        String result = "???";

        if (mois > 12 || mois < 0) {
            throw new IllegalArgumentException("Valeur du mois entre 1 et 12 compris: "+ mois);
        }

        switch (mois) {
            case 1 -> result = "Janvier";
            case 2 -> result = "Février";
            case 3 -> result = "Mars";
            case 4 -> result = "Avril";
            case 5 -> result = "Mai";
            case 6 -> result = "Juin";
            case 7 -> result = "Juillet";
            case 8 -> result = "Août";
            case 9 -> result = "Septembre";
            case 10 -> result = "Octobre";
            case 11 -> result = "Novembre";
            case 12 -> result = "Décembre";
        }

        return result;
    }

    //td 7 Exercice02 + td 8 Exercice01
    public static void afficherTitre(int mois, int annee) {

        if (mois > 12 || mois < 0) {
            throw new IllegalArgumentException("Valeur du mois doit etre compris entre 1 et 12 inclu: "+ mois);
        }

        String chaineMois = nomMois(mois);
        System.out.println("==========================");
        System.out.println("      "+ chaineMois + " " + annee);
        System.out.println("==========================");
    }

    //Exercice04
    public static void affichierEntete() {
        System.out.println("Lu  Ma  Me  Je  Ve  Sa  Di");
    }

    //td 7 Exercice05 + td8 Exercice01
    public static void afficherMois(int decalage, int nombreJours) {

        if (6 < decalage || decalage < 0)
            throw new IllegalArgumentException("Le decalage doit etre compris entre 1 et 6 inclu: "+ decalage);
        if ( nombreJours > 31 || nombreJours < 0)
            throw new IllegalArgumentException("Nombre de jours doit se situer entre 1 et 31 inclu: " + nombreJours);

        int numJour;

        for (int i = 1; i <= nombreJours+decalage; i = i + 1) {
            numJour = i - decalage;
            if (i <= decalage) {
                System.out.print("  " + "  ");
            } else if (numJour < 10) {
                    System.out.print( "0" + numJour + "  ");
            } else {
                System.out.print(numJour + "  ");
            }
            if (i % 7 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
    }

    //td 7 Exercice06
    public static boolean estBissextile(int annee) {
        return ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0);
    }

    //td 7 Exercice07 + td 8 Exercice01
    public static int nombreJours(int mois, int annee) {
        if (mois > 12 || mois < 0)
            throw new IllegalArgumentException("Le mois doit etre compris entre 1 et 12 inclu: " + mois);
        int nbJours;
        switch (mois) {
            case 4, 6, 9, 11:
                nbJours = 30;
                break;

            case 2:
                if (estBissextile(annee))
                    nbJours = 29;
                else
                    nbJours = 28;
                break;

            default:
                nbJours = 31;

        }
        return nbJours;
    }

    //td 7 Exercice08 + td 8 Exercice01
    public static int numeroJour(int jour, int mois, int annee) {

        if (mois > 12 || mois < 0)
            throw new IllegalArgumentException("Le mois doit etre compris entre 1 et 12 inclu: " + mois);
        else if (jour < 0 || jour > nombreJours(mois, annee))
            throw new IllegalArgumentException("Nombre de jour entre 1 et " + nombreJours(mois, annee) + " inclu: " +
                    jour);

        int h, q, m, j, k;

        q = jour;
        j = (annee-1) / 100;
        k = (annee-1) % 100;

        if (mois == 1)
            m = 13;
        else if (mois == 2)
            m = 14;
        else {
            m = mois;
            j = annee / 100;
            k = annee % 100;
        }


        h = (q + (m+1)*13/5 + k + k/4 + j/4 + (5 * j) + 5) % 7;

        return h;
    }

    //td8 Exercice03

    public static int lireEntier(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Ceci n'est pas un entier !");
            System.out.println(message);
        }
        return in.nextInt();
    }

    public static int lireAnnee(String message) {
        return lireEntier(message);
    }
    public static int lireMois(String message) {
        int monEntier = lireEntier(message);
        while (monEntier < 1 || monEntier > 12) {
            System.out.println("Nombre entier entre 1 et 12 inclu.");
            monEntier = lireEntier(message);
        }
        return monEntier;
    }

}
