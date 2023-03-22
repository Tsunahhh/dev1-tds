package g60552.dev1.td10;

public class Exercice08 {
    public static int pgcd(int a, int b) {
        int pgcd = -1;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                pgcd = i;
            }
        }
        if (pgcd < 0)
            throw new IllegalArgumentException("ERREUR: PGCD introuvble");

        return pgcd;
    }
    public static void main(String[] args) {

    }
}
