package g60552.dev1.td10;

import java.util.Arrays;

public class Exercice03 {


    /*
    * Test      mot:      candidat:     doit donner:
    *  1      bonjour      jourbon         true
    *  2        été         hiver          false
    *  3      manger       ranger          false
    *  4      Verre         Rever          true
    */


    public static boolean estAnagramme(String mot, String candidat) {
        boolean res;
        if (mot.length() != candidat.length()) {
            res = false;
        } else {
            // Mettre le mot en minuscule car on doit juste comparer les lettres
            mot = mot.toLowerCase();
            candidat = candidat.toLowerCase();

            // transformer la chaine "String" en tableau de caractères "char[]"
            char[] mot1 = mot.toCharArray();
            char[] mot2 = candidat.toCharArray();

            // Trier les 2 tableaux pour obtenir les lettres de l'alphabet dans l'ordre alphabetique
            // Grâce à la méthode sort() de la classe Arrays.
            Arrays.sort(mot1);
            Arrays.sort(mot2);

            // Retourner si les 2 tableaux sont égaux ou pas.
            res = Arrays.equals(mot1, mot2);
        }
        return res;

    }

    public static void main(String[] args) {

        // Effectuer les tests.
        System.out.println(estAnagramme("bonjour", "jourbon")); // donne true
        System.out.println(estAnagramme("été", "hiver"));       // donne false
        System.out.println(estAnagramme("manger", "ranger"));   // donne false
        System.out.println(estAnagramme("Verre", "Rever"));     // donne true

    }
}
