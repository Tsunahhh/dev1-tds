package g60552.dev1.td11;

public class Exercice01 {

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
     * Affiche un tableau.
     * @param tab le tableau à afficher
     */

    static void afficherTab(int[] tab) {
        for (int valeur : tab) { // pour chaque valeur dans le tableau ’tab’
            System.out.print(valeur+" ");
        }
        System.out.println(); // on passe à la ligne
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

    static void multiplier(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] * valeur;
        }
    }
}