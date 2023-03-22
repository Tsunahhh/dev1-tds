package g60552.dev1.td11;

public class Exercice05 {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        afficherTab(tableau);
        int[] copie1 = copie(tableau);
        int[] copie2 = pasUneCopie(tableau);
        int[] copie3 = miroir(tableau);
        tableau[0] = 9;
        System.out.print("tableau: " );
        afficherTab(tableau);
        System.out.print("copie1: " );
        afficherTab(copie1);
        System.out.print("copie2: " );
        afficherTab(copie2);
        System.out.print("copie3: " );
        afficherTab(copie3);
    }

    static int[] copie(int[] tab) {
        int[] copie = new int[tab.length];
        for (int i = 0; i <tab.length; i++) {
            copie[i] = tab[i];
        }
        return copie;
    }
    static int[] pasUneCopie(int[] tab) {
        int[] copie = tab;
        return copie;
    }
    static void afficherTab(int[] tab) {
        for (int element : tab) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    /**
     * Exercice05
     * Copie des éléments inversé d'une tableau.
     * @param tab tableau d'éléments.
     * @return la copie.
     */
    static int[] miroir(int[] tab) {
        int[] miroirTab = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            miroirTab[i] = tab[tab.length-i - 1];
        }
        return miroirTab;
    }
}
