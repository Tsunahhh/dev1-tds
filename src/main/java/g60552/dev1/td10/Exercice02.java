package g60552.dev1.td10;

public class Exercice02 {
    // test 1 | n = 5 | doit sortir : 15
    public static int somme(int n) {
        int somme = 0;

        if (n > 0) {
            for (int i = 1; i <= n; i = i + 1) {
                somme = somme + i;
            }
        }

        else if (n < 0) {
            throw new IllegalArgumentException("ERREUR: la variable n : 0 <= n : " + n);
        }
        return somme;
    }

    public static void main(String[] args) {
        System.out.println(somme(5)); // test 1 : doit sortir 1 + 2 + 3 + 4 + 5 = 15
        System.out.println(somme(3)); // test 2 : doit sortir 1 + 2 + 3 = 6
        System.out.println(somme(-5)); // test 3 : doit sortir erreur
        System.out.println(somme(0)); // test 4 : doit dortir 0
    }
}
