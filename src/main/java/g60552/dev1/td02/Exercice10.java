package g60552.dev1.td2;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        double taux, base, end;
        Scanner in = new Scanner(System.in);
        taux = 0.02;

        System.out.println("Montant de base: ");
        base = in.nextDouble();
        end = base * (1.00 + taux);

        System.out.println("Montant apres un an: " + end);
    }
}
