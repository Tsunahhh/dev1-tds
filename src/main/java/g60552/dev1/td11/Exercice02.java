package g60552.dev1.td11;

public class Exercice02 {

    /**
     * Exemple d’utilisations de tableaux d’entier.
     * @param args pas utilisé.
     */
    public static void main(String[] args) {
        int[] tab = {2, 5, -3};
        multiplier(tab, -2);
        afficherTab(tab);
    }

    /**
     * Exercice02
     * Affiche un tableau.
     * @param tab le tableau à afficher
     */
    static void afficherTab(int[] tab) {
        System.out.print("[" + tab[0]);
        for (int i = 1; i < tab.length; i++) {
            System.out.print(", " + tab[i]);
        }
        System.out.println("]");
    }

    /**
     * Incrémente chaque composante du tableau.
     * @param tab le tableau à incrémenter.
     */
    static void incrementer(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }

    //Exercice01
    /**
     * Exercice01
     * Multiplier le tableau par une valeur.
     * @param tab tableau à multiplier.
     * @param valeur valeur qui multiplie le tableau.
     **/
    static void multiplier(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] * valeur;
        }
    }
}
