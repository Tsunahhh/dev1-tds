package g60552.dev1.td10;

public class Exercice05 {
    /* Nombre Occurences - Plan de tests:
    *
    * Tests:        lettre:         texte:          doit sortir:
    * 1             'a'             "alpha"         2
    * 2             'z'             "aspirateur"    0
    * 3             'p'             'prosopopee"    3
    */

    public static int nbOccurences(char lettre, String texte) {
        int nbOcc = 0;
        for (int i = 0; i < texte.length(); i++) {
            if (lettre == texte.charAt(i)) {
                nbOcc = nbOcc + 1;
            }
        }
        return nbOcc;
    }

    public static void main(String[] args) {
        System.out.println(nbOccurences('a', "alpha"));      // sortie: 2
        System.out.println(nbOccurences('z', "aspirateur")); // sortie: 0
        System.out.println(nbOccurences('p', "prosopopee")); // sortie: 3
        //System.out.println(nbOccurences(1 , "10101")); // erreur
    }
}
