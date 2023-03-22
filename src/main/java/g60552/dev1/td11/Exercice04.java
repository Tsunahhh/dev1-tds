package g60552.dev1.td11;

public class Exercice04 {
    public static void main(String[] args) {
        String[] mots = {"the", "quick", "brown", "fox", "jumps", "over", "the",
                "lazy", "dog"};

        for (String mot : mots) {
            System.out.print(mot+" ");
        }
        System.out.println();

        afficheTableau(mots);
        afficherTailles(mots);
        System.out.println(plusLongMot(mots));
    }

    /**
     * Afficher les mots du tableau.
     * @param mots tableau de mots.
     */
    static void afficheTableau(String[] mots) {
        for (String mot : mots) {
            System.out.print(mot+" ");
        }
        System.out.println();
    }

    /**
     * Exercice 03.
     * Afficher les tailles des différents mots du tableau.
     * @param tab le tableau de mots.
     */
    static void afficherTailles(String[] tab) {
        for (String mot : tab) {
            System.out.print(mot.length() + " ");
        }
        System.out.println();
    }

    static String plusLongMot(String[] tab) {
        String motActuel = "";
        for (String mot : tab) {
            if (mot.length() > motActuel.length())
                motActuel = mot;
        }
        return motActuel;
    }
}
