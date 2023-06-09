package g60552.dev1.td11;

public class TableauChaines {
    public static void main(String[] args) {
        String[] mots = {"the", "quick", "brown", "fox", "jumps", "over", "the",
                "lazy", "dog"};

        for (String mot : mots) { // pour chaque mot dans le tableau ’mots’
            System.out.print(mot+" "); // affiche le mot suivi d’une espace.
        }
        System.out.println(); // passe à la ligne.

        afficheTableau(mots); // la même chose, mais dans une méthode.
    }

    static void afficheTableau(String[] mots) {
        for (String mot : mots) {
            System.out.print(mot+" ");
        }
        System.out.println();
    }

}