package g60552.dev1.td11;

public class TableauUtil {

    //Exercice07
    public static double min(double[] tab) {
        double mini = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < mini)
                mini = tab[i];
        }
        return mini;
    }

    public static double max(double[] tab) {
        double max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        return max;
    }

    public static double somme(double[] tab) {
        double somme = 0;
        for (double elem : tab) {
            somme += elem;
        }
        return somme;
    }

    public static double moyenne(double[] tab) {
        double somme = 0;
        for (double elem : tab) {
            somme += elem;
        }
        return somme/tab.length;
    }
    public static double[] copie(double[] tab) {
        double[] cop = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            cop[i] = tab[i];
        }
        return cop;
    }

    //Exercice08
    public static int indiceMax(double[] tab) {
        int indice = 0;
        double max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
                indice = i;
            }
        }
        return indice;
    }

    public static boolean estTrie(double[] tab) {
        double prev = tab[0];
        boolean trie = true;
        for(int i = 1; i < tab.length; i++) {
            if (prev > tab[i])
                trie = false;
            prev = tab[i];
        }
        return trie;
    }

    /**
     * Donne l'indice d'une valeur dans le tableau
     * @param tab le tableau considéré.
     * @param valeur la valeur que l'on veut chercher.
     * @return la valeur de l'indice ou -1 si il n'y en a pas.
     */
    public static int indice(int[]tab, int valeur) {
        int defaultRes = -1;
        int i = 0;
        do{
            if (tab[i] == valeur)
                defaultRes = i;
            i++;
        } while (i < tab.length && tab[i-1] != valeur);
        return defaultRes;
    }

    public static boolean contient(String[] tab, String mot) {
        boolean isIn = mot.equals(tab[0]);
        int i = 0;
        while (i < tab.length && !isIn) {

            isIn = mot.equals(tab[i]);
            i++;
        }
        return isIn;
    }

    public static boolean contient(double[] tab, double valeur, double erreur) {
        boolean isIn = (tab[0] < (valeur + erreur)) && (tab[0] > (valeur - erreur));
        int i = 1;
        while(i < tab.length && !isIn) {
            isIn = (tab[i] < (valeur + erreur)) && (tab[i] > (valeur - erreur));
            i++;
        }
        return isIn;
    }

    //Exercice09
    public static boolean doublons(int[] tab) {
        int i = 0;
        int j;
        boolean aUnDouble = false;
        while (i < tab.length - 1 && !aUnDouble) {
            j = i + 1;
            while (j < tab.length && !aUnDouble) {
                aUnDouble = tab[i] == tab[j];
                j++;
            }
            i++;
        }
        return aUnDouble;
    }

    public static int nbNegatifs(double[] tab) {
        int cpt = 0;
        for (double elem : tab) {
            if (elem < 0)
                cpt++;
        }
        return cpt;
    }

    public static void echange(double[] tab, int indice1, int indice2) {
        double tmp;
        tmp = tab[indice1];
        tab[indice1] = tab[indice2];
        tab[indice2] = tmp;
    }

    public static void inverser(double[] tab) {
        int mid = tab.length/2;
        double tmp;
        for (int i = 0; i < mid; i++) {
            tmp = tab[i];
            tab[i] = tab[tab.length-1-i];
            tab[tab.length-1-i] = tmp;
        }
    }

    public static int[] indicesMin(double[] tab) {
        int taille = 1;
        int j = 0;
        double min = tab[0];
        int[] miniTab;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                taille = 1;
                min = tab[i];
            } else if (tab[i] == min) {
                taille++;
            }
        }

        miniTab = new int[taille];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == min) {
                miniTab[j] = i;
                j++;
            }
        }

        return miniTab;
    }
}
