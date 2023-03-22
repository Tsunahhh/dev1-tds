package g60552.dev1.td07;



public class DateUtil {

    //Exercice01
    public static String nomMois(int mois) {
        String result = "???";
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

    //Exercice02
    public static void afficherTitre(int mois, int annee) {
        String chaineMois = nomMois(mois);
        System.out.println("==========================");
        System.out.println("      "+ chaineMois + " " + annee);
        System.out.println("==========================");
    }

    //Exercice04
    public static void affichierEntete() {
        System.out.println("Lu  Ma  Me  Je  Ve  Sa  Di");
    }

    //Exercice05
    public static void afficherMois(int decalage, int nombreJours) {
        int numJour;
        for (int i = 1; i <= nombreJours + decalage; i = i + 1) {
            numJour = i - decalage;
            if (i <= decalage) {
                System.out.print("  " + "  ");
            } else if (numJour < 10) {
                    System.out.print( "0" + numJour + "  ");
            } else {
                System.out.print(numJour + "  ");
            }
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("==========================");
    }

    //Exercice06
    public static boolean estBissextile(int annee) {
        return ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0);
    }

    //Exercice07
    public static int nombreJours(int mois, int annee) {
        int result;
        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 ||
                mois == 10 || mois == 12) {
            result = 31;
        } else if (mois == 2 && estBissextile(annee)) {
            result = 29;
        } else if (mois == 2 && !estBissextile(annee)) {
            result = 28;
        } else {
            result = 30;
        }
        return result;
    }

    //Exercice08
    public static int numeroJour(int jour, int mois, int annee) {
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

        h = (q + ((m+1)*13) / 5 + k + (k/4) + (j/4) + 5 * j + 5) % 7;

        return h;
    }
}
