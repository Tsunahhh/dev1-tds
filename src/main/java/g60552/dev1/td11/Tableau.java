package g60552.dev1.td11;

/**
 * Exemple d’utilisations des tableaux
 * @author dev1
 */
public class Tableau {

    /**
     * Exemple d’utilisations de tableaux d’entier.
     * @param args pas utilisé.
     */
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        System.out.println("taille: " + tab.length);
        System.out.println("1er élément: " + tab[0]);
        System.out.println("dernier élément: " + tab[tab.length-1]);
        System.out.println("autre élément: " + tab[2]);
        System.out.println("afficher un truc: " + tab);
        afficherTab(tab);
        incrementer(tab);
        afficherTab(tab);
        int[] tab2 = new int[10];
        afficherTab(tab2);
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
}